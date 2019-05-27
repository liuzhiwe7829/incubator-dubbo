/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.dubbo.rpc.service;

@Deprecated
//若某类或某方法加上该注解之后，表示此方法或类不再建议使用，调用时也会出现删除线，
// 但并不代表不能用，只是说，不推荐使用，
// 因为还有更好的方法可以调用。
public interface GenericService extends org.apache.dubbo.rpc.service.GenericService {

    @Override
    Object $invoke(String method, String[] parameterTypes, Object[] args)
            throws com.alibaba.dubbo.rpc.service.GenericException;
}
