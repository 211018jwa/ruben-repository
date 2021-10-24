package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

//the purpose of the controller layer is to receive information from a request

public class ArithmeticController {
	
	public ArithmeticService arithmeticService;

	//constructor
	public ArithmeticController(ArithmeticService arithmeticService) {
		this.arithmeticService = new ArithmeticService();
	}
	
	
	//this is what is known as a lambda.
	public Handler add = (ctx) -> {
		
		
		//ctx.formParam() extracts the information
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		
		ctx.result(arithmeticService.doAddition(number1String, number2String));
	};
	
	public Handler subtract = (ctx) -> {
		
		//ctx.formParam() extracts the information
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		
		ctx.result(arithmeticService.doSubtraction(number1String, number2String));
	};
	
	public Handler multiply = (ctx) -> {
		
		//ctx.formParam() extracts the information
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
	
		
		ctx.result(arithmeticService.doMultiplication(number1String, number2String));
	};
	
	public Handler divide = (ctx) -> {
		
		//ctx.formParam() extracts the information
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		
		
		ctx.result(arithmeticService.doDivision(number1String, number2String));
	};
	
	
	//define an instance method
	public void registerEndpoint(Javalin app) {
		app.post("/add", add);// mapping the add lambda and will be invoked whenever a client sends an HTTP POST request
	    app.post("/subtract", subtract);
	    app.post("/multiply", multiply);
	    app.post("/divide", divide);
	
	}
	
	
	
	

}
