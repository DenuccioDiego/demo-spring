package com.example.demo.configuration;

import com.example.demo.database.JdbcConnectionFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration("configBean")
@ComponentScan(basePackages = { "com.example.demo.*" })
@PropertySources({
        @PropertySource("classpath:/application.properties")
})
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;

    @Value("${spring.datasource.password}")
    private String databasePassword;

    @Value("${spring.datasource.driver-class-name}")
    private String databaseDriverClassName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public JdbcConnectionFactory jdbcConnectionFactory() {
        JdbcConnectionFactory cf = new JdbcConnectionFactory();
        cf.setDatabaseDriverClassName(databaseDriverClassName);
        cf.setDatabaseUrl(databaseUrl);
        cf.setDatabaseUsername(databaseUsername);
        cf.setDatabasePassword(databasePassword);
        return cf;
    }

}
