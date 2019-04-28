package com.conan.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringStore implements Store {

    @Bean
    Store getStringStore() {
        return new StringStore();
    }


}
