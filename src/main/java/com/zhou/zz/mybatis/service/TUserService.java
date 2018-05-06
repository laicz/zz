package com.zhou.zz.mybatis.service;

import java.util.List;

import com.zhou.zz.mybaties.model.TUser;

public interface TUserService {
	int deleteByPrimaryKey(Integer id);

	int insert(TUser record);

	TUser selectByPrimaryKey(Integer id);

	List<TUser> selectAll();

	int updateByPrimaryKey(TUser record);

	public TUser getUserWithRole(Integer id);
}
