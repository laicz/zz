package com.zhou.zz.seckill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.zz.seckill.dao.MeituanMapper;
import com.zhou.zz.seckill.model.Meituan;

@Service
public class MeituanServiceImpl implements MeituanService {

	@Autowired
	private MeituanMapper meituanMapper;

	@Override
	public int insert(Meituan record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Meituan> selectAll() {
		List<Meituan> meituanList = meituanMapper.selectAll();
		return meituanList;
	}

}
