package com.zhou.zz.seckill.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.zz.seckill.dao.TSeckillMapper;
import com.zhou.zz.seckill.model.TSeckill;

/**
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月8日下午9:19:10
 */
@Service
public class TSeckillMysqlServiceImpl implements TSeckillService {

	@Autowired
	TSeckillMapper tSeckillMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TSeckill record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TSeckill selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TSeckill> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(TSeckill record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateNum(String sku, int buys) {
		Map<String, Object> record = new HashMap<String, Object>();
		record.put("sku", sku);
		record.put("buys", buys);
		return tSeckillMapper.updateNum(record) == 1 ? true : false;
	}

}
