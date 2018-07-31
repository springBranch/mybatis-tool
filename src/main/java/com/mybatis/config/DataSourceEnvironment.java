package com.mybatis.config;

/**
 * @author song.j
 * @create 2017-09-13 14:14:23
 **/
public enum DataSourceEnvironment {
    DATASOURCE("datasource");


    private String datasource;

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    DataSourceEnvironment(String datasource) {
        this.datasource = datasource;
    }
}
