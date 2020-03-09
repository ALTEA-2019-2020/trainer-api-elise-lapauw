package com.miage.altea.trainer_api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestConfiguration {
    private String user;

    private String password;

    @Value("${spring.security.user.name}")
    void setUser(String user) {
        this.user = user;
    }

    @Value("${spring.security.user.password}")
    void setPassword(String password) {
        this.password = password;
    }

    @Bean
    RestTemplate trainerApiRestTemplate(){
        RestTemplate template = new RestTemplate();

        //Create and initialize the interceptor
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add( new BasicAuthenticationInterceptor( user, password ) );
        template.setInterceptors( interceptors );
        return template;
    }

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
