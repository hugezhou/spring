package com.zhoushugang.springbootamqp;

import com.zhoushugang.springbootamqp.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringBootAmqpApplicationTests {

	@Autowired
	RabbitTemplate rabbitTemplate;


	@Autowired
	AmqpAdmin amqpAdmin;


	@Test
	public void createAdmin(){
//		amqpAdmin.declareExchange(new DirectExchange("dingmeili.exchange"));

//		amqpAdmin.declareQueue(new Queue("dingmeili.queue",true));

		amqpAdmin.declareBinding(new Binding("dingmeili.queue", Binding.DestinationType.QUEUE,"dingmeili.exchange","dingmeili.mei",null));
	}


	@Test
	public void send() {

		Map<String,String> map = new HashMap<>();
		map.put("msg","this is a msg");
		map.put("data","test");

		rabbitTemplate.convertAndSend("zhou.direct","zhou.news",new  Book("孩子王","吴一"));

	}

	@Test
	public void receive() {

		Object o = rabbitTemplate.receiveAndConvert("zhou.news");

		System.out.println(o.getClass());

		System.out.println(o);
	}

}
