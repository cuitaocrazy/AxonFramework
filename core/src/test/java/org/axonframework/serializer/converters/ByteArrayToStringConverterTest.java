/*
 * Copyright (c) 2010-2012. Axon Framework
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
 */

package org.axonframework.serializer.converters;

import org.junit.*;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

/**
 * @author Allard Buijze
 */
public class ByteArrayToStringConverterTest {

    @Test
    public void testConvert() throws UnsupportedEncodingException {
        ByteArrayToStringConverter testSubject = new ByteArrayToStringConverter();
        assertEquals(String.class, testSubject.targetType());
        assertEquals(byte[].class, testSubject.expectedSourceType());
        assertEquals("hello", testSubject.convert("hello".getBytes("UTF-8")));
    }

}
