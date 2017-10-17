package com.nick.www.mybatis.factory;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class SqlFactory {
    
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlFactory sqlSessionFactory = (SqlFactory) new SqlSessionFactoryBuilder().build(inputStream);

}
