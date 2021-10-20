package com.SpringDemo.DemoProject.config;

import com.SpringDemo.DemoProject.Services.MyServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public MyServices myservices(){
        return new MyServices();
    }
}
