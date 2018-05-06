package com.zhou.zz.seckill.dao;

import java.util.List;
import java.util.Map;

import com.zhou.zz.common.annotation.MybatisDao;
import com.zhou.zz.seckill.model.TSeckill;

/**
 * 秒杀dao
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午9:09:59
 */
@MybatisDao
public interface TSeckillMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(TSeckill record);

	TSeckill selectByPrimaryKey(Integer id);

	List<TSeckill> selectAll();

	int updateByPrimaryKey(TSeckill record);

	int updateNum(Map<String, Object> record);

}