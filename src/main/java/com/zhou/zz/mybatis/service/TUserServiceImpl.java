package com.zhou.zz.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.zz.mybaties.model.TUser;
import com.zhou.zz.mybatis.dao.TUserMapper;

/**
 * service
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月16日下午9:01:35
 */
@Service
public class TUserServiceImpl implements TUserService {

	@Autowired
	TUserMapper tuserMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TUser selectByPrimaryKey(Integer id) {
		return tuserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TUser> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(TUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TUser getUserWithRole(Integer id) {
		return tuserMapper.getUserWithRole(id);
	}

}
