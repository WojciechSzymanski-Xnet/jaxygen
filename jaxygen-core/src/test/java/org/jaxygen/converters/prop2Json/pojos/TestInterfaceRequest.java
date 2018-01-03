/*
 * Copyright 2017 xnet.
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
package org.jaxygen.converters.prop2Json.pojos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jknast
 */
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class TestInterfaceRequest {

    private String stringField;
    private int intField;
    private InterfaceTest interfaceField;
    private List<InterfaceTest> interfacesListField = new ArrayList();

}