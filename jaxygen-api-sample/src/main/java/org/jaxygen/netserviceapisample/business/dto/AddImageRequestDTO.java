/*
 * Copyright 2012 Artur Keska.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jaxygen.netserviceapisample.business.dto;

import org.jaxygen.annotations.QueryMessage;
import org.jaxygen.dto.Uploadable;

/**This is a sample request containing file uploaded over HTTP
 *
 * @author Artur keska
 */
@QueryMessage
public class AddImageRequestDTO {
    private Uploadable file;

    public Uploadable getFile() {
        return file;
    }

    public void setFile(Uploadable file) {
        this.file = file;
    }
}
