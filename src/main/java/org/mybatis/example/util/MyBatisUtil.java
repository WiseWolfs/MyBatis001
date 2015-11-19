package org.mybatis.example.util;

import java.io.IOException;
import java.io.InputStream;

import com.javafx.tools.doclets.internal.toolkit.util.DocFinder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBatisUtil {
    private static SqlSessionFactory factory = null;
    private static final Logger logger = LoggerFactory.getLogger(MyBatisUtil.class);
    private static void initialFactory(){
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            logger.error(e.getMessage(),e);
        }
    }

    public static SqlSession getSession() {
        if(factory == null) {
            initialFactory();
        }

        return factory.openSession();
    }
}
