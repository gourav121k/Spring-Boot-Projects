package com.package1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.package1.entity.Product;

import java.util.*;
public interface ProductRepository extends JpaRepository<Product, Integer>{
  public List<com.package1.entity.Product> findByName(String name);
}
