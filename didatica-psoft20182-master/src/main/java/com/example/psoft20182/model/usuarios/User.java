package com.example.psoft20182.model.usuarios;
import java.util.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes;
@Entity(name = "usuario")
@Table(name = "tb_usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JsonSubTypes({@JsonSubTypes.Type(value = Client.class, name = "CLIENT"), 
			   @JsonSubTypes.Type(value = Administrator.class, name = "ADMINISTRATOR")
})

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name")
	@NotNull(message = "Nome nao pode ser nulo")
	@NotEmpty(message = "Nome nao pode ser vazio")
	private String name;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column (name = "birthday")
	private Date birthday;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private Role role;
	
	
	
	
	public User(String userName, String userCPF, Date userBirthday,String userEmail, String userPassword, Role role) {
		this.name = userName;
		this.cpf = userCPF;
		this.email = userEmail;
		this.password = userPassword;
		this.birthday = userBirthday;
		this.role = role;
	}

	
	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) throws Exception {
		if(this.cpf == null || this.cpf.trim().isEmpty()) {
			this.cpf = cpf;
		}
		else {
			throw new Exception("Cpf is already set");
		}
	}

	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String senha) throws Exception {
	   if(this.password == null || this.password.trim().isEmpty()) {
		   this.password = senha;
	   }
	   else {
		   throw new Exception("Password is already set");
	   }
	}


	public Date getAniversario() {
		return birthday;
	}


	public void setAniversario(Date aniversario) {
		this.birthday = aniversario;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
}
