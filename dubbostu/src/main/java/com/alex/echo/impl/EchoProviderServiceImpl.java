package com.alex.echo.impl;

import com.alex.echo.itf.IEchoProviderService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author alex
 * @Title: EchoProviderServiceImpl
 * @Description: TODO
 * @date 2020-08-25 19:19
 */
@Service
public class EchoProviderServiceImpl implements IEchoProviderService {
    public String echo(String content) {
        
        System.out.println("Hello "+content);
        return "echo "+content;
    }
}
