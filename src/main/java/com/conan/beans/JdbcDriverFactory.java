package com.conan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = "classpath:jdbc-config.xml")
@Configuration
public class JdbcDriverFactory {

    @Value("${username}")
    private String name;

    @Value("${password}")
    private String pwd;

    @Bean
    public JdbcDriver getJdbcDriver() {
        return new JdbcDriver(name, pwd);
    }
}
