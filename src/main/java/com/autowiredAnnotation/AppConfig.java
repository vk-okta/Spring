package com.autowiredAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.autowiredAnnotation")
public class AppConfig {
}
