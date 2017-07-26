package com.chelsea.jedisCluster;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.JedisCluster;

public class StandaloneZKServerTest{
	
	ApplicationContext ctx = null;
	JedisCluster jedis = null;
	
	@Before 
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring.xml");
		jedis = (JedisCluster)ctx.getBean("jedisCluster");
	}
	
	@Test
	public void testJedis(){
		String value = jedis.get("testkey");
		System.out.println(value);
	}
	
}
