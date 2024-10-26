package ru.netology.jdbc.task1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.netology.jdbc.task1.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	public List<String> getProducts(String name) {
		return repository.getProductName(name);
	}
}
