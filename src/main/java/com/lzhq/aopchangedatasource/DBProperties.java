package com.lzhq.aopchangedatasource;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Data
@ConfigurationProperties(prefix = "hikari")
public class DBProperties {
    public HikariDataSource getTest1() {
        return test1;
    }

    public void setTest1(HikariDataSource test1) {
        this.test1 = test1;
    }

    public HikariDataSource getTest2() {
        return test2;
    }

    public void setTest2(HikariDataSource test2) {
        this.test2 = test2;
    }

    private HikariDataSource test1;
    private HikariDataSource test2;
}
