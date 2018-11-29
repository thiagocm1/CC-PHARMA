package com.example.psoft20182.repository;
import com.example.psoft20182.model.usuarios.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository  extends JpaRepository<User,String>{
		@Query("SELECT u FROM User u WHERE u.email = ?1")
		public User findUserByEmail(String userEmail);
		@Query("SELECT u FROM User u WHERE u.cpf = ?1")
		public User findUserByCpf(String userCPF);
}

