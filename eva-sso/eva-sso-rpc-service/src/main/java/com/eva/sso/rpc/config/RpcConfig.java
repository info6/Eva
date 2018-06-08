package com.eva.sso.rpc.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RpcConfig {

	@Value("${zookeeper.address}")
	private String zkAddress;

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("provider-test");
		applicationConfig.setLogger("slf4j");
		return applicationConfig;
	}

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(zkAddress);
		registryConfig.setClient("curator");
		return registryConfig;
	}
}