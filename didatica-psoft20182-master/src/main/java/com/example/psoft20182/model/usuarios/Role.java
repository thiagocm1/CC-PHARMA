package com.example.psoft20182.model.usuarios;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Role {
	CLIENT("CLIENT"), ADMINISTRADOR("ADMINISTRATOR");
	private String value;
	
	private Role(String value) {
		this.value = value;
	}
	@JsonValue
	public String getValue() {
		return this.value;
	}
	
}
