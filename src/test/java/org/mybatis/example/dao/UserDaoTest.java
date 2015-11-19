package org.mybatis.example.dao;

import org.junit.*;
import org.junit.Test;
import org.mybatis.example.dao.impl.UserDaoImpl;
import org.mybatis.example.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by wuyong on 15/11/19.
 */
public class UserDaoTest {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
    private IUserDao userDao ;
    @Before
    public void before(){
        userDao = new UserDaoImpl();
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setName("wuyong");
        user.setId(1);
        userDao.insert(user);
    }

    @Test
    public void testQueryAll(){
        List<User> userlist = userDao.queryAll();
        for(User u:userlist){
            System.out.println(u.getName());
        }
        logger.info("userlist:{}",userlist);
    }

}
