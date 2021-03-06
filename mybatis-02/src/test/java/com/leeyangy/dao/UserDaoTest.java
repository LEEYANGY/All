package com.leeyangy.dao;

import com.leeyangy.pojo.User;
import com.leeyangy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leeyangy on 2021/6/25 22:22
 */
public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(2);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(5, "李9", "123321"));
        if (res > 0) {
            System.out.println("插入数据成功!");
        }else{
            System.out.println("插入数据失败,请检查!");
        }
//        提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4, "李6", "321"));
        if (res > 0) {
            System.out.println("修改数据成功!");
        }else {
            System.out.println("修改失败,请检查!");
        }
        //        提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.deleteUser(5);
        if (res > 0) {
            System.out.println("删除数据成功!");
        }else {
            System.out.println("删除失败,请检查!");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
