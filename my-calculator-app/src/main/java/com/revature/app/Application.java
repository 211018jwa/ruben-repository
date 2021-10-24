package com.revature.app;

import com.revature.controller.ArithmeticController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import com.revature.service.ArithmeticService;

public class Application {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create(config -> {
			config.addStaticFiles("/", Location.CLASSPATH);
		});
		
		//Instantiate our controller
		ArithmeticController controller1 = new ArithmeticController(new ArithmeticService());
		controller1.registerEndpoint(app);
		
		
		app.start(8080);
		
		

	}

}
