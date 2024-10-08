package com.ashraf.TechStore.services;

import org.springframework.data.jpa.repository.*;

import com.ashraf.TechStore.models.*;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
