package ru.netology.jdbc.task1.repository;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ru.netology.jdbc.task1.Util;

@Repository
public class ProductRepository {

	private static final String SCRIPT = Util.read("select_product_name.sql");

	private final NamedParameterJdbcTemplate template;

	public ProductRepository(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public List<String> getProductName(String name) {
		return template.queryForList(SCRIPT, Map.of("name", name), String.class);
	}
}