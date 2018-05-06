package com.zhou.zz.seckill.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhou.zz.seckill.model.TSeckill;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

@Service
public class TSeckillRedisServiceImpl implements TSeckillService {

	private static final Logger logger = LoggerFactory.getLogger(TSeckillRedisServiceImpl.class);

	@Autowired
	JedisPool jedisPool;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TSeckill record) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.set(record.getSku(), String.valueOf(record.getNum()));
		} catch (Exception e) {
			logger.error("", e);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
		return 0;
	}

	@Override
	public TSeckill selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TSeckill> selectAll() {
		return null;
	}

	@Override
	public int updateByPrimaryKey(TSeckill record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateNum(String sku, int buys) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			int num = Integer.parseInt(jedis.get(sku));
			if (num < buys) {
				return false;
			}
			return jedis.decrBy(sku, buys) >= 0L ? true : false;
		} catch (Exception e) {
			logger.error("获取Redis资源异常", e);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}
		return false;
	}

}
