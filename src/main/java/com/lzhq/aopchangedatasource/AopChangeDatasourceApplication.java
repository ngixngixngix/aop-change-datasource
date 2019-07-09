package com.lzhq.aopchangedatasource;

import com.lzhq.aopchangedatasource.dao.UserInfoMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.lzhq.aopchangedatasource.dao")
public class AopChangeDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopChangeDatasourceApplication.class, args);
    }

}
