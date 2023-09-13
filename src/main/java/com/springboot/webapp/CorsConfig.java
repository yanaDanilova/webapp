package com.springboot.webapp;

// Import the necessary classes
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

// Create a configuration class
@Configuration
public class CorsConfig {

    // Define a bean for the CorsFilter
    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilter() {
        // Create a UrlBasedCorsConfigurationSource object and register a CorsConfiguration for all paths
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true); // Allow cookies and other credentials
        config.addAllowedOrigin("*"); // Allow all origins
        config.addAllowedHeader("*"); // Allow all headers
        config.addAllowedMethod("*"); // Allow all methods
        source.registerCorsConfiguration("/**", config);

        // Create a FilterRegistrationBean object and set the order and filter properties
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(0); // Set the order to 0 to make this filter be the first in the chain
        return bean;
    }
}