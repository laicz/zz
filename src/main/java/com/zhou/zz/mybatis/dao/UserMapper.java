package com.zhou.zz.mybatis.dao;

import java.util.List;

import com.zhou.zz.mybaties.model.User1;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User1 record);

    User1 selectByPrimaryKey(Integer id);

    List<User1> selectAll();

    int updateByPrimaryKey(User1 record);
}