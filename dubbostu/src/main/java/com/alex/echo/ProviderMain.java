package com.alex.echo;

import com.alex.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author alex
 * @Title: ProviderMain
 * @Description: TODO
 * @date 2020-08-25 19:35
 */
public class ProviderMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        context.start();
        System.in.read();
    }
}
