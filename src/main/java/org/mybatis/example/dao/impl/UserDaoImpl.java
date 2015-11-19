package org.mybatis.example.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.example.dao.IUserDao;
import org.mybatis.example.entity.User;
import org.mybatis.example.util.MyBatisUtil;

import java.util.List;

/**
 * Created by wuyong on 15/11/19.
 */
public class UserDaoImpl implements IUserDao {

    public void insert(User user) {
        SqlSession session = MyBatisUtil.getSession();
        IUserDao userMapper = session.getMapper(IUserDao.class);
        userMapper.insert(user);
        session.commit();
    }

    public List<User> queryAll() {
        SqlSession session = MyBatisUtil.getSession();
        IUserDao userMapper = session.getMapper(IUserDao.class);
        return userMapper.queryAll();
    }
}
