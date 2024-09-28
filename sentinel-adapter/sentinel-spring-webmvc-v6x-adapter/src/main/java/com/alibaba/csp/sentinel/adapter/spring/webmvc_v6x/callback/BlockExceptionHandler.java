/*
 * Copyright 1999-2024 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.adapter.spring.webmvc_v6x.callback;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Handler for the blocked request.
 *
 * @since 1.8.8
 */
public interface BlockExceptionHandler {

    /**
     * Handle the request when blocked.
     *
     * @param request  Servlet request
     * @param response Servlet response
     * @param resourceName resource name
     * @param e        the block exception
     * @throws Exception users may throw out the BlockException or other error occurs
     */
    void handle(HttpServletRequest request, HttpServletResponse response, String resourceName, BlockException e)
        throws Exception;

}
