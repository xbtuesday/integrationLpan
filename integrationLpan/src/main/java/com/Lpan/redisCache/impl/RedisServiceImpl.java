package com.Lpan.redisCache.impl;


import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lpan.redisCache.RedisService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 
 * 
 * Jedis是Redis在Java中的redis- client
 * 
 * @author shipan
 *
 */
@Service
public class RedisServiceImpl implements RedisService {
	
	@Autowired
	private JedisPool jedisPool;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RedisServiceImpl.class);

//	public RedisServiceImpl(JedisPool jedisPool) {
//		jedis = jedisPool.getResource();
//	}
	
	public void add(String key, String value,int timeout) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			if(-1 == timeout){
				jedis.set(key, value);
			}else{
				jedis.setex(key, timeout, value);
			}
		} catch (Exception e) {
			LOGGER.info("redis缓存add 错误日志");
			e.printStackTrace();
		}finally{
			closePool(jedis);
		}
		
	}
	public boolean add(String key, Object value) {
		
		return false;
	}

	public void delete(String key) {
		Jedis jedis = null;
		jedis = jedisPool.getResource();
		jedis.del(key);
	}

	public String get(String key) {
		Jedis jedis = null;
		jedis = jedisPool.getResource();
		String string = jedis.get(key);
		closePool(jedis);
		return string;
	}
	
	public boolean existKey(String key) {
		Jedis jedis = null;
		jedis = jedisPool.getResource();
		Boolean exists = jedis.exists(key);
		return exists;
	}
	
	protected void closePool(Jedis j) {
		if (null != j) {
			try {
				jedisPool.returnResource(j);
			} catch (Exception e) {
				LOGGER.error("Redis缓存closePool错误日志：", e);
			}
		}
	}
	
}
