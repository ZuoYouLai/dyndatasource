package com.example.dyndatasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


/**
 * Created by :  Sorata   2017/6/26 0026 上午 11:02.
 */
@Configuration
@MapperScan(basePackages = TempDataSourcesConfig.PACKAGES, sqlSessionFactoryRef = "tempSqlSessionFactory")
public class TempDataSourcesConfig {

    static final String PACKAGES = "com.example.dyndatasource.mapper.temp";

    private static final String MAPPER_LOCAL = "classpath:mapper/temp/*.xml";

    @ConfigurationProperties("spring.datasource.temp")
    @Bean(name = "tempDataSource")
    public DruidDataSource druidDataSource() {
        return new DruidDataSource();
    }


    @Bean(name = "tempTransactionManager")
    public DataSourceTransactionManager tempTransactionManager() {
        return new DataSourceTransactionManager(druidDataSource());
    }


    @Bean(name = "tempSqlSessionFactory")
    public SqlSessionFactory tempSqlSessionFactory(@Qualifier("tempDataSource") DruidDataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCAL));
        return sessionFactoryBean.getObject();
    }


}
