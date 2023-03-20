package com.example.treetest.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static com.github.javafaker.Faker.instance;
import static java.util.Locale.ENGLISH;

@Configuration
public class DataGeneratorConfig {

    @Bean()
    @Scope("singleton")
    Faker faker() {
        return instance(ENGLISH);
    }
}
