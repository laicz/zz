package com.zhou.zz.seckill.service;

import java.util.List;

import com.zhou.zz.seckill.model.TSeckill;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午9:18:52
 */
public interface TSeckillService {
	int deleteByPrimaryKey(Integer id);

	int insert(TSeckill record);

	TSeckill selectByPrimaryKey(Integer id);

	List<TSeckill> selectAll();

	int updateByPrimaryKey(TSeckill record);

	boolean updateNum(String sku, int buys);
}
