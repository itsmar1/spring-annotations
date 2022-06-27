package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {

    @Bean
    public FortuneService wreslingFortuneService() {
        return new WreslingFortuneService();
    }

    @Bean
    public Coach wreslingCoach() {
        return new WreslingCoach(wreslingFortuneService());
    }
}
