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
package com.epam.ta.reportportal.core.imprt.impl;

/**
 * Factory for launch import handlers. Could be implemented other imports in future versions.
 *
 * @author Pavel_Bortnik
 */

public interface ImportStrategyFactory {

  /**
   * Return import handler for specified type of import.
   *
   * @param type     import type
   * @param fileName file name with extension
   * @return handler
   */
  ImportStrategy getImportStrategy(ImportType type, String fileName);
}
