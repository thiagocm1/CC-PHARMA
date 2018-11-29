package com.example.psoft20182.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psoft20182.model.usuarios.Role;
import com.example.psoft20182.model.usuarios.User;
import com.example.psoft20182.service.AuthenticationService;

@RestController
@CrossOrigin
@RequestMapping("/auth")

public class AuthenticationController {
	public static final String TOKEN_VALUE_KEY = "X-auth-Token";
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
	
	@Autowired
	private AuthenticationService authService;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Role createToken(@RequestBody User user,
			@RequestHeader(required = true, value = TOKEN_VALUE_KEY) String tokenValue) {
			logger.info(tokenValue);
			logger.info(user.getEmail());
			return this.authService.createToken(tokenValue, user.getEmail());
			
	}
	
	
}
