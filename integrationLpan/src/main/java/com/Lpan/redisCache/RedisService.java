package com.Lpan.redisCache;

/**
 * 
 * @author shipan
 *
 */
public interface RedisService {
	/**
	 * redis保存一个字符串类型的值  
	 * @param key
	 * @param value
	 * @return
	 */
	void add(String key,String value,int timeout);
	
	/**
	 * redis保存一个list类型的值
	 * @param key
	 * @param value
	 * @return
	 */
	boolean add(String key , Object value);
	
	/**
	 * 根据键移除一个redis值
	 * @param key
	 */
	void delete(String key);
	
	
	/**
	 * 根据键获取一个redis中的值
	 * @param key
	 * @return
	 */
	String get(String key);
	
	
	/**
	 * 判断是否存在
	 * @param key
	 * @return
	 */
	 boolean existKey(String key);
	
}
