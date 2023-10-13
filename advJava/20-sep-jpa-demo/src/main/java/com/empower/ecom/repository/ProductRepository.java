package com.empower.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.ecom.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
