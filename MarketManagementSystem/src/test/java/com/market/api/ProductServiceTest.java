package com.market.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.market.api.model.core.Product;
import com.market.api.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
	
	@Autowired
	private ProductService productServ;
	
	@Test
	public void testCreateProductServ() {
		Product prod = new Product("banana prata", "banana prata AA", 100.0, 10.0);
		prod = productServ.insertProduct(prod);
		
		assertThat(prod).isNotNull();		
	}
	
}
