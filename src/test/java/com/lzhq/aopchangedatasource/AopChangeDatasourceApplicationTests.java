package com.lzhq.aopchangedatasource;

import com.lzhq.aopchangedatasource.entity.UserInfo;
import com.lzhq.aopchangedatasource.dao.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AopChangeDatasourceApplication.class)
public class AopChangeDatasourceApplicationTests {
    private static Logger log = LoggerFactory.getLogger(AopChangeDatasourceApplicationTests.class);

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testDynamicDatasource() {
        UserInfo userInfo;
        for (int i = 1; i <= 2; i++) {
            //i为奇数时调用selectByOddUserId方法获取，i为偶数时调用selectByEvenUserId方法获取
            userInfo = i % 2 == 1 ? userInfoMapper.selectByOddUserId(i) : userInfoMapper.selectByEvenUserId(i);
            log.info("{}=={}", userInfo.getId(),userInfo.getRemarks());
        }
    }

}
