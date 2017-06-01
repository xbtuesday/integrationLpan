package com.Lpan.redisCache;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;


@Component
public class RedisCacheUtils<T> {
	@Autowired
	public RedisTemplate redisTemplate; 
	
	/**
	 * 
	* @Title: setCacheObject
	* @Description: TODO(缓存基本类型对象  int,String,实体类等)
	* @param @param key
	* @param @param value
	* @param @return    设定文件
	* @return ValueOperations<String,T>    返回类型
	* @auther shipan
	* @throws
	 */
	public <T> ValueOperations<String,T> setCacheObject(String key, T value){
		ValueOperations<String,T> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);
		return opsForValue;
	}
	
	/**
	 * 
	* @Title: setCacheObject
	* @Description: TODO(缓存基本类型对象int,String,等实体类)
	* @param @param key
	* @param @param value
	* @param @param expensetime	
	* @param @return    设定文件
	* @return ValueOperations<String,T>    返回类型
	* @auther shipan
	* @throws
	 */
	public <T> ValueOperations<String,T> setCacheObject(String key ,T value,long expensetime){
		ValueOperations<String,T> opsForValue = redisTemplate.opsForValue();
		opsForValue.set(key, value);
		redisTemplate.expire(key, expensetime, TimeUnit.SECONDS);
		return opsForValue;
	}
	
	/**
	 * 
	* @Title: getCacheObject
	* @Description: TODO(获取一个基本类型对象 int,String，实体类等)
	* @param @param key
	* @param @return    设定文件
	* @return T    返回类型
	* @auther shipan
	* @throws
	 */
	public <T> T getCacheObject(String key){
		ValueOperations<String,T> opsForValue = redisTemplate.opsForValue();
		return  opsForValue.get(key);
	}
	
	/**
	 * 
	* @Title: isExistCacheObject
	* @Description: TODO(查看缓存中是否存在某个键值对)
	* @param @param key
	* @param @return    设定文件
	* @return boolean    返回类型
	* @auther shipan
	* @throws
	 */
	public boolean isExistCacheObject(String key){
		boolean flag = false;
		ValueOperations forValue = redisTemplate.opsForValue();
		return flag;
	}
	
	
}
