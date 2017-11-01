/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.storage.base.define;

/**
 * @author peng-yongsheng
 */
public interface Operation {
    String operate(String newValue, String oldValue);

    Long operate(Long newValue, Long oldValue);

    Double operate(Double newValue, Double oldValue);

    Integer operate(Integer newValue, Integer oldValue);

    Boolean operate(Boolean newValue, Boolean oldValue);

    byte[] operate(byte[] newValue, byte[] oldValue);
}