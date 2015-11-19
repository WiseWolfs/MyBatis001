package org.mybatis.example.dao;

import org.mybatis.example.entity.User;

import java.util.List;

/**
 * Created by wuyong on 15/11/19.
 */
public interface IUserDao {
    /**
     * 插入一条记录
     * @param user
     */
    public void insert(User user);

    /**
     * 查询所有记录
     * @return
     */
    public List<User> queryAll();
}
