package com.alex.echo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.alibaba.dubbo.rpc.service.GenericService;

/**
 * @author alex
 * @Title: GenericConsumer
 * @Description: TODO
 * @date 2020-08-25 20:00
 */
public class GenericConsumer {
    public static void main(String[] args) {
        // 普通编码配置方式
        ApplicationConfig application = new ApplicationConfig();
        application.setName("echo-generic-invoke");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://192.168.226.131:2181");

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface("com.alex.echo.itf.IEchoProviderService");
        // 声明为泛化接口
        reference.setGeneric(true);
        try {
            ReferenceConfigCache cache = ReferenceConfigCache.getCache();
            GenericService genericService = cache.get(reference);

            /** 调用的方法名称 */
            String method = "echo";
            /** 方法参数的类型，多个参数使用数组表示 */
            String[] parameterTypes = new String[]{"java.lang.String"};
            /** 参数值，多个参数使用数组表示 */
            Object[] argments = new Object[]{"曾经沧海难为水"};
            
            // 基本类型以及Date,List,Map等不需要转换，直接调用
            Object result = genericService.$invoke("echo",
                    new String[]{"java.lang.String"},
                    new Object[]{"曾经沧海难为水"});
            System.out.println("------调用返回------");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
