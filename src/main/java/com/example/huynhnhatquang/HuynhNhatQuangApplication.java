package com.example.huynhnhatquang;

import com.example.huynhnhatquang.model.Product;
import com.example.huynhnhatquang.model.User;
import com.example.huynhnhatquang.repository.ProductRepository;
import com.example.huynhnhatquang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HuynhNhatQuangApplication {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(HuynhNhatQuangApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				for (int i=1; i<=10; i++){
					userRepository.save(new User(i, "User" + i));
					productRepository.save(new Product(i, "Product"+i, 123));
				}
			}
		};
	}
}
