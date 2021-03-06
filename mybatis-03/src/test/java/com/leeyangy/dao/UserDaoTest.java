package com.leeyangy.dao;

import com.leeyangy.pojo.User;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by leeyangy on 2021/6/25 22:22
 */
public class UserDaoTest {
    @Test
    public void getUserById() {
//        1.必写
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
//            2.必写
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
