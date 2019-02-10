/*
 * Copyright 2014-2019 Andrew Gaul <andrew@gaul.org>
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

package org.gaul.modernizer_maven_plugin;

import java.nio.charset.Charset;

import com.google.common.base.Charsets;

import org.gaul.modernizer_maven_annotations.SuppressModernizer;

public class SuppressModernizerTestClasses {

    @SuppressModernizer
    public static final class SuppressedOnClass {
        public Charset getCharset() {
            return Charsets.UTF_8;
        }

        public static final class InnerClass {
            public Charset getCharset() {
                return Charsets.UTF_8;
            }
        }
    }

    public static final class SuppressedOnMembers {
        @SuppressModernizer
        public Charset getCharset() {
            return Charsets.UTF_8;
        }

        @SuppressModernizer
        public static final class InnerClass {
            public Charset getCharset() {
                return Charsets.UTF_8;
            }
        }
    }
}
