package com.sinocbd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Test
	public void contextLoads() {
		//1.设置ip和端口
		Jedis jedis = new Jedis("192.168.2.172",6379);
		//2.保存数据
		jedis.set("name","Mihai");
		//3.获取数据
		String name = jedis.get("name");
		System.out.println(name);
		//4.释放资源
		jedis.close();
	}

}
