package com.example.psoft20182.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.psoft20182.model.usuarios.Administrator;
import com.example.psoft20182.model.usuarios.Client;

@Repository
public interface ClientRepository extends JpaRepository< Client,String> {
	

	@Query("select u from Client u where u.name = ?1")
	public Client findClientByName(String name);

	@Query("select u from Client u where u.email = ?1")
	public Client findClientByEmail(String name);


}
