package com.alex.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alex
 * @Title: AppConfig
 * @Description: TODO
 * @date 2020-08-25 19:23
 */

@Configuration
@EnableDubbo(scanBasePackages={"com.alex.echo"})
public class AppConfig {
    
    @Bean
    public ProviderConfig providerConfig(){
        return new ProviderConfig();
    }
    
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("echo-service");
        return applicationConfig;
    }
    
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.226.131");
        registryConfig.setPort(2181);
        return registryConfig;
    }
    
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
