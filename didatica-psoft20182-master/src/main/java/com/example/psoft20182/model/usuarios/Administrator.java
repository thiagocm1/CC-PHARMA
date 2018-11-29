package com.example.psoft20182.model.usuarios;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.psoft20182.controller.AuthenticationController;
@Component
@Entity
@DiscriminatorValue(value = "tb_administrator")

public class Administrator extends User {
	
	public Administrator(String userEmail) {
		super(null, userEmail, null, Role.ADMINISTRADOR);
		logger.info(userEmail);
	}


	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	



}
