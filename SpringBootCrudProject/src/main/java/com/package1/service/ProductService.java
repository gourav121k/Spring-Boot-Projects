package com.package1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.package1.entity.Product;
import com.package1.repository.ProductRepository;



@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public Product saveProduct(Product p) {
		return repo.save(p);
	}
	
	public List<Product> saveProducts(List<Product>  p) {
		return repo.saveAll(p);
	}
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	
	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Product> getProductsByName(String name) {
		return repo.findByName(name);
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "product deleted"+id;
	}
	public String deleteAll() {
		repo.deleteAll();
		return "all products deleted";
	}
	
	public Product updateProduct(Product prod) {
		repo.save(prod);
		return prod;
	}

}
