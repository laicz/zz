package com.zhou.zz.mybatis.dao;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.mybaties.model.Role;
import java.util.List;

@MybatisDao
public interface TRoleMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Role record);

	Role selectByPrimaryKey(Integer id);

	List<Role> selectAll();

	int updateByPrimaryKey(Role record);
}