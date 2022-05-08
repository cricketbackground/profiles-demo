package com.example.profiles.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("postgres-database")
@Data
public class PostgresDatasource {

    private String dbUrl;

    private String dbDriver;
}
