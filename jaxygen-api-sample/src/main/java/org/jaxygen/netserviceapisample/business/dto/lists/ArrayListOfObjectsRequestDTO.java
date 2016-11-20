/*
 * Copyright 2016 Jakub Knast.
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
package org.jaxygen.netserviceapisample.business.dto.lists;

import java.util.ArrayList;
import org.jaxygen.netserviceapisample.business.dto.UserDTO;
import org.jaxygen.netserviceapisample.business.dto.UserDTO;

/**
 *
 * @author jknast
 */
public class ArrayListOfObjectsRequestDTO {
    private ArrayList<UserDTO> list = new ArrayList<>();

    public ArrayList<UserDTO> getList() {
        return list;
    }

    public void setList(ArrayList<UserDTO> list) {
        this.list = list;
    }
}