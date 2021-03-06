package com.smslast.studentmanagementlast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StudentConfig implements WebMvcConfigurer {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
