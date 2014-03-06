/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.tests.interceptors.aroundConstruct.extended.ejb;

import javax.ejb.Stateful;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.jboss.weld.test.util.ActionSequence;

@Stateful
public class BeanWithConstructorLevelBinding {

    // for proxies
    public BeanWithConstructorLevelBinding() {
    }

    @Inject
    @AlphaBinding(2)
    public BeanWithConstructorLevelBinding(BeanManager manager) {
        ActionSequence.addAction(BeanWithConstructorLevelBinding.class.getSimpleName());
    }
}