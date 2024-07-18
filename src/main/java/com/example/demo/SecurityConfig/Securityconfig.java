package com.example.demo.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Securityconfig 
{
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity)throws Exception
	{
		
		httpSecurity.authorizeHttpRequests((req)->req.anyRequest().authenticated());
	
		
		
		
		
		return null;
	}

}
