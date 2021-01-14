package com.example.registrationproduct.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registrationproduct.entity.Product;
import com.example.registrationproduct.repository.ProductRepository;

@ResponseBody
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/product")
	public ResponseEntity<?> create(@RequestBody Product product) {

		try {

			Product p = productRepository.save(product);

			Map<String, Object> map = new HashMap<String, Object>() {
				{
					put("product-saved", p);
					put("status", "saved successfully");
				}
			};

			return ResponseEntity.status(200).body(map);

		} catch (Exception ex) {

			Map<String, Object> error = new HashMap<String, Object>() {
				{
					put("saving-error", ex.getMessage());
				}
			};
			return ResponseEntity.status(200).body(error);
		}
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.status(200).body(productRepository.findAll());
	}

}
