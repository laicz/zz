package com.zhou.zz.seckill.dao;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.seckill.model.Meituan;
import java.util.List;

@MybatisDao
public interface MeituanMapper {
	int insert(Meituan record);

	List<Meituan> selectAll();
}