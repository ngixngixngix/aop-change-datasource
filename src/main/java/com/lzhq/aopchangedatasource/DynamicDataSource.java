package com.lzhq.aopchangedatasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
    //数据源路由，此方用于产生要选取的数据源逻辑名称
    @Override
    protected Object determineCurrentLookupKey() {
        //从共享线程中获取数据源名称
        return DynamicDataSourceHolder.getDataSource();
    }
}
