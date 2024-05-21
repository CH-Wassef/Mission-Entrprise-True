package com.example.missionentreprisetrue;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:57536") // Autoriser le domaine d'origine de votre frontend
                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Autoriser les méthodes HTTP nécessaires
                    .allowedHeaders("*"); // Autoriser tous les headers
        }
    }
