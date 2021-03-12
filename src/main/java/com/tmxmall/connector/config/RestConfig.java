package com.tmxmall.connector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean("restemplate")
    public RestTemplate getRestemplate(){
        return  new RestTemplate();
    }
}
