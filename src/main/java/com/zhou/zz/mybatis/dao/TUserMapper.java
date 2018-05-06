package com.zhou.zz.mybatis.dao;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.mybaties.model.TUser;
import java.util.List;

@MybatisDao
public interface TUserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TUser record);

	TUser selectByPrimaryKey(Integer id);

	List<TUser> selectAll();

	int updateByPrimaryKey(TUser record);

	public TUser getUserWithRole(Integer id);
}