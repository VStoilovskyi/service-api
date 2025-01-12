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

package com.epam.ta.reportportal.core.admin;

import static com.epam.ta.reportportal.entity.ServerSettingsConstants.ANALYTICS_CONFIG_PREFIX;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toMap;

import com.epam.ta.reportportal.dao.ServerSettingsRepository;
import com.epam.ta.reportportal.entity.ServerSettings;
import com.epam.ta.reportportal.ws.converter.converters.ServerSettingsConverter;
import com.epam.ta.reportportal.ws.model.OperationCompletionRS;
import com.epam.ta.reportportal.ws.model.settings.AnalyticsResource;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Basic implementation of server administration interface {@link ServerAdminHandler}
 *
 * @author Andrei_Ramanchuk
 */
@Service
public class ServerAdminHandlerImpl implements ServerAdminHandler {

  private final ServerSettingsRepository serverSettingsRepository;

  @Autowired
  public ServerAdminHandlerImpl(ServerSettingsRepository serverSettingsRepository) {
    this.serverSettingsRepository = serverSettingsRepository;
  }

  @Override
  public Map<String, String> getServerSettings() {
    return ServerSettingsConverter.TO_RESOURCE.apply(
        serverSettingsRepository.selectServerSettings());
  }

  @Override
  public OperationCompletionRS saveAnalyticsSettings(AnalyticsResource analyticsResource) {
    String analyticsType = analyticsResource.getType();
    Map<String, ServerSettings> serverAnalyticsDetails = findServerSettings().entrySet()
        .stream()
        .filter(entry -> entry.getKey().startsWith(ANALYTICS_CONFIG_PREFIX))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    String formattedAnalyticsType = analyticsType.startsWith(ANALYTICS_CONFIG_PREFIX) ?
        analyticsType :
        ANALYTICS_CONFIG_PREFIX + analyticsType;

    ServerSettings analyticsDetails = ofNullable(
        serverAnalyticsDetails.get(formattedAnalyticsType)).orElseGet(ServerSettings::new);
    analyticsDetails.setKey(formattedAnalyticsType);
    analyticsDetails.setValue(
        String.valueOf((ofNullable(analyticsResource.getEnabled()).orElse(false))));

    serverSettingsRepository.save(analyticsDetails);
    return new OperationCompletionRS("Server Settings were successfully updated.");
  }

  private Map<String, ServerSettings> findServerSettings() {
    return serverSettingsRepository.selectServerSettings()
        .stream()
        .collect(toMap(ServerSettings::getKey, s -> s, (prev, curr) -> prev));
  }
}