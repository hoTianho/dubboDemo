package com.java1234.service.impl;

import com.java1234.service.DemoProviderServiceApi;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: Copyright (c) 2018</p>
 * <p>公司: 智业软件股份有限公司</p>
 *
 * @author GHX
 * @date 2018-07-13 17:55
 */
public class DemoProviderServiceImpl implements DemoProviderServiceApi {
    @Override
    public String sayHello(String name) {
        return "服务sayHello:" + name;
    }
}
