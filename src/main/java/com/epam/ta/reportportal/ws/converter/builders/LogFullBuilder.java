/*
 * Copyright 2019 EPAM Systems
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

package com.epam.ta.reportportal.ws.converter.builders;

import static java.util.Optional.ofNullable;

import com.epam.ta.reportportal.commons.EntityUtils;
import com.epam.ta.reportportal.entity.enums.LogLevel;
import com.epam.ta.reportportal.entity.item.TestItem;
import com.epam.ta.reportportal.entity.launch.Launch;
import com.epam.ta.reportportal.entity.log.LogFull;
import com.epam.ta.reportportal.ws.model.log.SaveLogRQ;
import java.util.UUID;
import java.util.function.Supplier;

/**
 * @author Pavel Bortnik
 */
public class LogFullBuilder implements Supplier<LogFull> {

  private final LogFull logFull;

  public LogFullBuilder() {
    logFull = new LogFull();
  }

  public LogFullBuilder addSaveLogRq(SaveLogRQ createLogRQ) {
    logFull.setLogLevel(LogLevel.toCustomLogLevel(createLogRQ.getLevel()));
    logFull.setLogMessage(ofNullable(createLogRQ.getMessage()).orElse("NULL"));
    logFull.setLogTime(EntityUtils.TO_LOCAL_DATE_TIME.apply(createLogRQ.getLogTime()));
    logFull.setUuid(ofNullable(createLogRQ.getUuid()).orElse(UUID.randomUUID().toString()));
    return this;
  }

  public LogFullBuilder addTestItem(TestItem testItem) {
    logFull.setTestItem(testItem);
    return this;
  }

  public LogFullBuilder addLaunch(Launch launch) {
    logFull.setLaunch(launch);
    return this;
  }

  public LogFullBuilder addProjectId(Long projectId) {
    logFull.setProjectId(projectId);
    return this;
  }

  @Override
  public LogFull get() {
    return logFull;
  }

}
