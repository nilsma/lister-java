package it.martinussen.lister;

import java.sql.Connection;

import it.martinussen.lister.controllers.ApplicationController;
import it.martinussen.lister.controllers.UserController;

public class Main {

	public static void main(String[] args) {
		ApplicationController applicationController = new ApplicationController();
		applicationController.runApplication();
	}

}
