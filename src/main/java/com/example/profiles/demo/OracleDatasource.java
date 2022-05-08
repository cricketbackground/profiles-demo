package com.example.profiles.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("oracle-database")
@Data
public class OracleDatasource {

    private String oracleDbUrl;

    private String oracleDbDriver;
}
