package com.example.demo.config;

import com.example.demo.interceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor());
        registry.addInterceptor(new Interceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
        registry.addInterceptor(new Interceptor()).addPathPatterns("/xx/*");
    }
}