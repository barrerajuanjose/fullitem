package com.jj.probing.fullitem.config;

import com.jj.probing.fullitem.config.spring.SpringConfig;
import com.jj.probing.fullitem.usecases.FindItem;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class Config {

    SpringConfig config = new SpringConfig();

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofMillis(3000))
                .setReadTimeout(Duration.ofMillis(3000))
                .build();
    }

    @Bean
    public FindItem createFindItem() {
        return config.createFindItem();
    }
}
