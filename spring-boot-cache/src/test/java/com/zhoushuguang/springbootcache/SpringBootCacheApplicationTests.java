package com.zhoushuguang.springbootcache;

import com.zhoushuguang.springbootcache.bean.Employee;
import com.zhoushuguang.springbootcache.mappper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCacheApplicationTests {


	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisTemplate redisTemplate;



	@Test
	public void testRedis() {

//		stringRedisTemplate.opsForValue().append("msg","test");

//		String msg = stringRedisTemplate.opsForValue().get("msg");
//
//		System.out.println(msg);

		stringRedisTemplate.opsForValue().append("msg","test");


	}


	@Test
	public void testRedisByObject() {

//		Employee e =
//				employeeMapper.getEmployeeById(1);
//
//
//
//		redisTemplate.opsForList().leftPush("emp01",e.getId(),e);


		Object emp = redisTemplate.opsForList().leftPop("empl");

		System.out.println(emp);



	}

	@Test
	public void contextLoads() {

		Employee e =
				employeeMapper.getEmployeeById(1);


		System.out.println(e);
	}

}
