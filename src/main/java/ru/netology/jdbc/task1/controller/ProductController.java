package ru.netology.jdbc.task1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.jdbc.task1.service.ProductService;

@RestController
public class ProductController {

	private final ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping("/products/fetch-product")
	@ResponseBody
	public List<String> getProduct(@RequestParam("name") String name) {
		return service.getProducts(name);
	}
}
