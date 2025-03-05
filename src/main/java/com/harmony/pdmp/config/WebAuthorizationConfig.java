/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Configuration.java to edit this template
 */
package com.harmony.pdmp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author Harmony
 */
@Configuration
public class WebAuthorizationConfig {
    
     @Bean
    SecurityFilterChain filterChain(HttpSecurity http)throws Exception {
        
        http.authorizeHttpRequests((authz)->authz.anyRequest().permitAll());
        
        return http.build();
    }
}
