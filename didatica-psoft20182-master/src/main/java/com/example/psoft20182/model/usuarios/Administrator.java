package com.example.psoft20182.model.usuarios;

import java.util.Date;

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
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	
	public Administrator(String emailUser) {
		super(null, null, null, emailUser,null, Role.ADMINISTRADOR);
	}
	
		
	

}
