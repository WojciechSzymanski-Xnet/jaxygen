/*
 * Copyright 2017 Artur.
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
package org.jaxygen.jaxygen.jap;

import com.google.inject.Binder;
import com.google.inject.Module;
import javax.persistence.EntityManager;
import org.jaxygen.frame.config.JaxygenModulePackage;

/**
 *
 * @author Artur
 */
public class JaxygenJpaModule extends JaxygenModulePackage implements Module{

    public JaxygenJpaModule() {
        super.withGuiceModules(JaxygenModulePackage.class.getPackage());
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(EntityManager.class).to(JxEntityManager.class);
    }

    
    
}