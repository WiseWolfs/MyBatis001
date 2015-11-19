package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Select;
import org.mybatis.example.entity.Blog;

/**
 * Created by wuyong on 15/11/19.
 */

public interface BlogMapper {
    @Select("SELECT * FROM t_blog WHERE id=#{id}")
    public Blog selectBlog(int id);
}
