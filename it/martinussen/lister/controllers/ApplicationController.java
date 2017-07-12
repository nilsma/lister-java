package it.martinussen.lister.controllers;

import java.sql.Connection;

import it.martinussen.lister.ConnectionManager;
import repositories.UserRepository;

public class ApplicationController {
	
	public void runApplication() {
		Connection connection = ConnectionManager.getConnection();
		UserRepository userRepository = new UserRepository(connection);
		System.out.println(userRepository.getUsername(1));
	}

}
