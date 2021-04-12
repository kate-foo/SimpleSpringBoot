package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties
public class AdminConfig {
	
	private List<String> admins = new ArrayList<>();
	
	public List<String> getAdmins(){
	      return this.admins;
	}

}
