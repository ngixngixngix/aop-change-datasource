package com.lzhq.aopchangedatasource.dao;

import com.lzhq.aopchangedatasource.TargetDataSource;
import com.lzhq.aopchangedatasource.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
    /**
     * 从test1数据源中获取用户信息
     */
    @Select("select id,remarks from test where id=#{id}")
    UserInfo selectByOddUserId(@Param("id") Integer id);
    /**
     * 从test2数据源中获取用户信息
     */
    @TargetDataSource("test2")
    @Select("select id,remarks from test where id=#{id}")
    UserInfo selectByEvenUserId(@Param("id") Integer id);
}
