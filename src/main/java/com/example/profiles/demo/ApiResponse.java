package com.example.profiles.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@RequiredArgsConstructor
public class ApiResponse {

    private String postgresDbUrl;

    private String postgresDbDriver;

    private String oracleDbUrl;

    private String oracleDbDriver;
}
