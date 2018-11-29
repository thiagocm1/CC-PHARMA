package com.example.psoft20182.model.usuarios;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class AdministratorProperties {
	@Value("${administrator_email_list}")
	private String emailList;
	
	private List<Administrator> administratorList = new ArrayList<Administrator>();
	
	@PostConstruct
	private void checkProperties() throws Exception {
		if(this.emailList == null || this.emailList.trim().isEmpty()) {
			throw new Exception("There is no administrator email configuration in application config file");
		}
		else {
			String[] administratorEmails = this.emailList.split(",");
			for (String admEmails : administratorEmails) {
				admEmails = admEmails.trim();
				Administrator administrator = new Administrator(admEmails);
			}
		}
	}
	
	public List<Administrator> getAdministratorList(){
		return this.administratorList;
	}
	
	
}
