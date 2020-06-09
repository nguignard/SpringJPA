package com.spring.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.spring.app.dao")
@EnableJpaRepositories("com.spring.app.dao")
@Import(JpaConfig.class)
public class AppConfig {
    
}
