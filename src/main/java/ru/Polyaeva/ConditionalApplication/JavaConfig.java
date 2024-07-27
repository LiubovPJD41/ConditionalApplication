package ru.Polyaeva.ConditionalApplication;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(value = "netology.dev.profile", havingValue = "true")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty(value = "netology.dev.profile", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
