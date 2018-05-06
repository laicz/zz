package com.zhou.zz.common.jedis;

import redis.clients.jedis.ShardedJedis;

/**
 * redis data source
 * 
 * @author Mr.Zhou
 * @datatime 2018年4月22日下午9:11:17
 */
public interface RedisDataSource {

	public abstract ShardedJedis getRedisClient();

	public void returnResource(ShardedJedis shardedJedis);

	public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
