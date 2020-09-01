package com.eleKant.config;

import com.eleKant.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {
    @Bean
    public HomeController homeController(){
        HomeController homeController = new HomeController();
        return homeController;
    }
}
