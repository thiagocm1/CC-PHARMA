package com.example.psoft20182.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.psoft20182.model.produto.*;

@Repository
public interface ProductRepository  extends JpaRepository<Product,String> {
	@Query("select u from Product u where u.name = ?1")
	public Product findProductByName(String name);

	@Query("select u from Product u where u.BarCode = ?1")
	public Product findProductByCode(String code);

}
