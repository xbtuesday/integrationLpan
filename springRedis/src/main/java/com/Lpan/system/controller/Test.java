package com.Lpan.system.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
     final RedisTemplate<String, Object> redisTemplate = ac.getBean("redisTemplate",RedisTemplate.class);
     //添加一个 key    
     ValueOperations<String, Object> value = redisTemplate.opsForValue();
     
     value.set("span", "liupp");
     //获取 这个 key 的值
     System.out.println(value.get("lp"));
	}
}
