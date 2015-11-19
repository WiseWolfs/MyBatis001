package org.mybatis.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.example.entity.Blog;
import org.mybatis.example.util.MyBatisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuyong on 15/11/19.
 */
public class BlogMapperTest {
    private static final Logger logger = LoggerFactory.getLogger(BlogMapperTest.class);
    @Test
    public void testSelectBlog(){
        SqlSession session = MyBatisUtil.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlog(1);
        logger.info("blog:{}",blog);
    }

}
