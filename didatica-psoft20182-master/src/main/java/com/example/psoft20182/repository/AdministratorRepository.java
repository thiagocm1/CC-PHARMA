package com.example.psoft20182.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.psoft20182.model.produto.Product;
import com.example.psoft20182.model.usuarios.Administrator;

@Repository

public interface AdministratorRepository extends JpaRepository<Administrator,String> {

	@Query("select u from Administrator u where u.name = ?1")
	public Administrator findAdmByName(String name);

	@Query("select u from Administrator u where u.email = ?1")
	public Administrator findAdmByEmail(String name);

}
