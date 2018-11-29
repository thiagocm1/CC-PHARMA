package com.example.psoft20182.model.usuarios;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "tb_student")

public class Client extends User{
	
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "birthday")
	private Date birthday;
	
	
	
	public Client(String userName, String userEmail, String userPassword, String userCPF,Date birthday,Role role) {
		super(userName, userEmail, userPassword, role.CLIENT);
		this.cpf = userCPF;
		this.birthday = birthday;
	}
	
	
	
}
