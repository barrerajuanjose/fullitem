package com.jj.probing.fullitem.config;

import com.jj.probing.fullitem.config.spring.SpringConfig;
import com.jj.probing.fullitem.usecases.FindItem;
import com.jj.probing.fullitem.usecases.FindPaymentOptionsByItemId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    SpringConfig config = new SpringConfig();

    @Bean
    public FindItem createFindItem() {
        return config.createFindItem();
    }

    @Bean
    public FindPaymentOptionsByItemId createFindPaymentOptionsByItemId() {
        return config.createFindPaymentOptionsByItemId();
    }
}
