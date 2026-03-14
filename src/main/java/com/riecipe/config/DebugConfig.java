package com.riecipe.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DebugConfig {

    @Bean
    ApplicationRunner debugEnv(Environment env) {
        return args -> {

            System.out.println("======== SPRING ENV DEBUG ========");

            System.out.println("spring.data.mongodb.uri = " +
                    env.getProperty("spring.data.mongodb.uri"));

            System.out.println("SPRING_DATA_MONGODB_URI = " +
                    System.getenv("SPRING_DATA_MONGODB_URI"));

            System.out.println("spring.data.mongodb.database = " +
                    env.getProperty("spring.data.mongodb.database"));

            System.out.println("server.port = " +
                    env.getProperty("server.port"));

            System.out.println("==================================");

        };
    }
}