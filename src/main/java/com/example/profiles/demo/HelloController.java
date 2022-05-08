package com.example.profiles.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
@RequiredArgsConstructor
public class HelloController {

    private final PostgresDatasource myDatabaseProperties;

    @GetMapping
    public ResponseEntity<ApiResponse> hello() {
        ApiResponse apiResponse = ApiResponse.builder().build();
        BeanUtils.copyProperties(myDatabaseProperties, apiResponse);
        return ResponseEntity.ok(apiResponse);
    }

}
