package com.sso.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("======================RPC服务正在启动======================");
		SpringApplication.run(App.class);
		logger.info("======================RPC服务启动完成======================");
	}

}
