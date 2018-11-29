package com.example.psoft20182.model.produto;

public enum Category {
	ALIMENTO("Alimento"), MEDICAMENTO("Medicamento"), COSMETICO("Cosmetico"), HIGIENE("Higiene");
	
	private String type;
	
	Category(){	}

	private Category(String type) {
		this.type = type;
		
	}
	
}