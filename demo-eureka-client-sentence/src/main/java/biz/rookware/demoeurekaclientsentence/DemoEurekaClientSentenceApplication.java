package biz.rookware.demoeurekaclientsentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaClientSentenceApplication.class, args);
	}

}
