/*
 * Copyright 2018 the original author or authors.
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

package org.gradle.internal.featurelifecycle;

import java.util.List;

public class DefaultDeprecatedUsageProgressDetails implements DeprecatedUsageProgressDetails {
    private final String message;
    private final String details;
    private final String advice;

    private final List<StackTraceElement> stackTrace;

    public DefaultDeprecatedUsageProgressDetails(String message, String details, String advice, List<StackTraceElement> stackTrace) {
        this.message = message;
        this.details = details;
        this.advice = advice;
        this.stackTrace = stackTrace;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public String getAdvice() {
        return advice;
    }

    @Override
    public List<StackTraceElement> getStackTrace() {
        return stackTrace;
    }
}
