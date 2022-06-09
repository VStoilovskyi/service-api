/*
 * Copyright 2022 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.epam.ta.reportportal.core;

import com.epam.ta.reportportal.dao.LogRepository;
import com.epam.ta.reportportal.dao.TestItemRepository;
import com.epam.ta.reportportal.entity.item.TestItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@Service
public class ElementsCounterService {

	private TestItemRepository testItemRepository;

	private LogRepository logRepository;

	@Autowired
	public ElementsCounterService(TestItemRepository testItemRepository, LogRepository logRepository) {
		this.testItemRepository = testItemRepository;
		this.logRepository = logRepository;
	}

	public Long countNumberOfLaunchElements(Long launchId) {
		long resultedNumber = 1L;
		final List<Long> testItemIdsByLaunchId = testItemRepository.findIdsByLaunchId(launchId);
		resultedNumber += testItemIdsByLaunchId.size();
		resultedNumber += logRepository.countLogsByTestItemItemIdIn(testItemIdsByLaunchId);
		resultedNumber += logRepository.countLogsByLaunchId(launchId);
		return resultedNumber;
	}

	public Long countNumberOfItemElements(TestItem item) {
		if (item != null) {
			long resultedNumber;
			final List<Long> itemIds = testItemRepository.selectAllDescendantsIds(item.getPath());
			resultedNumber = itemIds.size();
			resultedNumber += logRepository.countLogsByTestItemItemIdIn(itemIds);
			return resultedNumber;
		}
		return 0L;
	}

	public Long countNumberOfItemElements(List<TestItem> items) {
		if (!CollectionUtils.isEmpty(items)) {
			final AtomicLong resultedNumber = new AtomicLong(0L);
			items.forEach(item -> {
				final List<Long> itemIds = testItemRepository.selectAllDescendantsIds(item.getPath());
				resultedNumber.addAndGet(itemIds.size());
				resultedNumber.addAndGet(logRepository.countLogsByTestItemItemIdIn(itemIds));
			});
			return resultedNumber.get();
		}
		return 0L;
	}

}
