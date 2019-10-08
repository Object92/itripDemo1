package com.bdqn.dao.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.annotation.Resource;
import java.io.IOException;

/**
 * ClassName: cn.itrip.biz.config.mybatis.MyBatisConfig
 * Description: TODO  MyBatis核心配置类（JAVA的方式进行配置）
 * Author:
 * Date 2019/7/30 7:39
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfig {

    @Resource
    private DataSource dataSource;

    @Bean(value = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);//配置数据源
        bean.setTypeAliasesPackage("com.bdqn.beans.pojo");//配置实体
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
