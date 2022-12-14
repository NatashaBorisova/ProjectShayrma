package com.example.springsecurityapplication.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
    @Value("/C:/Users/ILLUZIA/Desktop/uploads")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // ** - какой либо текст
        registry.addResourceHandler("/img/**", "/css/**","/js/**")
                .addResourceLocations("file://" + uploadPath + "/",
                        "classpath:/static/img/",
                        "classpath:/static/icon/",
                        "classpath:/static/css/",
                        "classpath:/static/js/");
    }
}
