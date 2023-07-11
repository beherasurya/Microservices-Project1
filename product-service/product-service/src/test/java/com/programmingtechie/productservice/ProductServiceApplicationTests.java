package com.programmingtechie.productservice;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.productservice.controller.ProductController;
import com.app.productservice.dto.ProductResponse;
import com.app.productservice.model.Product;
import com.app.productservice.service.ProductService;

@SpringBootTest
class ProductServiceApplicationTests {

	ProductController productController;
	@Test
	void getProduct()
	{
	
	   productController.getAllProducts();
	}

	// @Test
	// void contextLoads() {
	// }

}
