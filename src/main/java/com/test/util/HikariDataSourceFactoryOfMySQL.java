package com.test.util;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class HikariDataSourceFactoryOfMySQL extends UnpooledDataSourceFactory {
    public HikariDataSourceFactoryOfMySQL() {
        this.dataSource = DataSourceUtil.createHikariDataSource();
    }
}
