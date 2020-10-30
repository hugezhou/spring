package com.zhoushugan.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动命令  docker run -id --name esearch -p 9200:9200 -p 9300:9300 elasticsearch:2.3.3
 */
@SpringBootApplication
public class ElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticApplication.class, args);
	}

}


