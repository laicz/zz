package com.zhou.zz.seckill.service;

import java.util.List;

import com.zhou.zz.seckill.model.Meituan;

public interface MeituanService {
	int insert(Meituan record);

	List<Meituan> selectAll();
}
