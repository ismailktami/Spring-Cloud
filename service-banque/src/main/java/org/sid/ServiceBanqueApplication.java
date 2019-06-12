package org.sid;

import java.util.stream.Stream;

import org.sid.dao.CompanyRepository;
import org.sid.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBanqueApplication.class, args);
	}

	
	@Bean
	CommandLineRunner start(CompanyRepository comapnyRepository) {
		
		return args->{
			Stream.of("ALTEN","SOFT","QUERF").forEach(cn->{
				comapnyRepository.save(new Company(cn,1000));
			});
			
			comapnyRepository.findAll().forEach(s->{
				
				System.out.println(s.getName());
			});
		};
	}
	@Bean
	public BCryptPasswordEncoder getBcryptePasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
