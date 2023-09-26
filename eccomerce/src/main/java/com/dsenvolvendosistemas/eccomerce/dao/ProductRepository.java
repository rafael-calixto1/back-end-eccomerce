package com.dsenvolvendosistemas.eccomerce.dao;

import com.dsenvolvendosistemas.eccomerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
