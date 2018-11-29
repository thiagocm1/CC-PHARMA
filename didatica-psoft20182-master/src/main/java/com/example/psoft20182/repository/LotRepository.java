package com.example.psoft20182.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.psoft20182.model.produto.Lot;
import com.example.psoft20182.model.usuarios.Client;
import com.example.psoft20182.model.usuarios.User;

public interface LotRepository extends JpaRepository<Lot,String>{

	@Query("select u from Lot u where u.id = ?1")
	public Lot findLotById(String id);
	
	@Query("select u from Lot u where u.date = ?1")
	public Lot findLotByDate(String date);
	

}
