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

package com.epam.ta.reportportal.core.widget.content.updater.validator;

import static com.epam.ta.reportportal.commons.Predicates.equalTo;
import static com.epam.ta.reportportal.commons.validation.BusinessRule.expect;
import static com.epam.ta.reportportal.core.widget.util.ContentFieldPatternConstants.COMBINED_CONTENT_FIELDS_REGEX;

import com.epam.ta.reportportal.commons.querygen.Filter;
import com.epam.ta.reportportal.core.widget.util.ContentFieldMatcherUtil;
import com.epam.ta.reportportal.entity.widget.WidgetOptions;
import com.epam.ta.reportportal.ws.model.ErrorType;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@Service
public class CumulativeTrendChartValidator implements MultilevelValidatorStrategy {

  @Override
  public void validate(List<String> contentFields, Map<Filter, Sort> filterSortMapping,
      WidgetOptions widgetOptions, String[] attributes,
      Map<String, String> params, int limit) {
    validateFilterSortMapping(filterSortMapping);
    validateContentFields(contentFields);
  }

  /**
   * Mapping should not be empty
   *
   * @param filterSortMapping Map of ${@link Filter} for query building as key and ${@link Sort} as
   *                          value for each filter
   */
  private void validateFilterSortMapping(Map<Filter, Sort> filterSortMapping) {
    expect(MapUtils.isNotEmpty(filterSortMapping), equalTo(true)).verify(
        ErrorType.BAD_REQUEST_ERROR,
        "Filter-Sort mapping should not be empty"
    );
  }

  /**
   * Validate provided content fields. The value of content field should not be empty All content
   * fields should match the pattern
   * {@link
   * com.epam.ta.reportportal.core.widget.util.ContentFieldPatternConstants#COMBINED_CONTENT_FIELDS_REGEX}
   *
   * @param contentFields List of provided content.
   */
  private void validateContentFields(List<String> contentFields) {
    expect(CollectionUtils.isNotEmpty(contentFields), equalTo(true)).verify(
        ErrorType.BAD_REQUEST_ERROR,
        "Content fields should not be empty"
    );
    expect(ContentFieldMatcherUtil.match(COMBINED_CONTENT_FIELDS_REGEX, contentFields),
        equalTo(true)
    ).verify(ErrorType.BAD_REQUEST_ERROR, "Bad content fields format");
  }
}
