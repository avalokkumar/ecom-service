package com.ecm.shop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopServiceApplication.class, args);
	}
	
	
	@GetMapping
	public ResponseEntity<String> getMessage() {
		
		return ResponseEntity.ok().body("Hello Clay");
	}

}

