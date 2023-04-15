package com.devapp.productservice.repository;

import com.devapp.productservice.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
