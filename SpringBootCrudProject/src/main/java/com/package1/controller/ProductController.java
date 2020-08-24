package com.package1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.package1.entity.Product;
import com.package1.service.ProductService;

import java.util.*;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product pr) {
		return service.saveProduct(pr);
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List <Product> pr) {
		return service.saveProducts(pr);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	@GetMapping("/product/{name}")
	public List<Product> findProductsByName(@PathVariable String name) {
		return service.getProductsByName(name);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product pr) {
		return service.updateProduct(pr);
	}
	
	
	@DeleteMapping("/products")
	public String deleteAllProducts(){
		return service.deleteAll();
	}
	
	@DeleteMapping("/product/{id}")
	public String deleteProductById(@PathVariable int id){
		return service.deleteById(id);
	}
	

}
