package com.leeyangy.dao;

import com.leeyangy.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * Created by leeyangy on 2021/7/2 23:12
 */
public interface BlogMapper {
//    插入数据
    @Insert("insert into blog (id,title,author,create_time,views) values (#{id},#{title},#{author},#{createTime},#{views})")
    int addBook(Blog blog);
//    查询
    List<Blog> queryBlogIF(Map map);
}
