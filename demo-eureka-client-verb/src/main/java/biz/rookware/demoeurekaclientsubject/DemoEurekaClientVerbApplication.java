package biz.rookware.demoeurekaclientsubject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaClientVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaClientVerbApplication.class, args);
	}

}
