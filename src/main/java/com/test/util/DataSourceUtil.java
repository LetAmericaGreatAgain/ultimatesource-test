package com.test.util;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceUtil {
    public static DataSource createHikariDataSource() {
        Properties properties = new Properties();
        try (InputStream inputStream = ClassLoader.getSystemResourceAsStream("application.properties")){
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String driver = properties.getProperty("mysql.jdbc.driver");
        String url = properties.getProperty("mysql.jdbc.url");
        String username = properties.getProperty("mysql.jdbc.username");
        String password = properties.getProperty("mysql.jdbc.password");
        String maxPoolSize = properties.getProperty("mysql.datasource.hikari.maxPoolSize");
        String minIdle = properties.getProperty("mysql.datasource.hikari.minIdle");
        String connectionTimeout = properties.getProperty("mysql.datasource.hikari.connectionTimeout");
        String validationTimeout = properties.getProperty("mysql.datasource.hikari.validationTimeout");
        String idleTimeout = properties.getProperty("mysql.datasource.hikari.idleTimeout");
        String maxLifetime = properties.getProperty("mysql.datasource.hikari.maxLifetime");
        String connectionTestQuery = properties.getProperty("mysql.datasource.hikari.connectionTestQuery");
        String keepaliveTime = properties.getProperty("mysql.datasource.hikari.keepaliveTime");

        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driver);
        hikariConfig.setJdbcUrl(url);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);
        hikariConfig.setMaximumPoolSize(Integer.parseInt(maxPoolSize));
        hikariConfig.setMinimumIdle(Integer.parseInt(minIdle));
        hikariConfig.setConnectionTimeout(Long.parseLong(connectionTimeout));
        hikariConfig.setValidationTimeout(Long.parseLong(validationTimeout));
        hikariConfig.setIdleTimeout(Long.parseLong(idleTimeout));
        hikariConfig.setMaxLifetime(Long.parseLong(maxLifetime));
        hikariConfig.setConnectionTestQuery(connectionTestQuery);
        hikariConfig.setKeepaliveTime(Long.parseLong(keepaliveTime));

        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
        return hikariDataSource;
    }
}
