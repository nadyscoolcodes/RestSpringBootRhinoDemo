package com.unique;

import java.io.FileNotFoundException;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.unique.rhino.RhinoClass;


@SpringBootApplication
public class RestSpringBootRhinoDemoApplication   {
	
	
	
/*	@Autowired
	static
	RhinoClass rhino;*/
	

	public static void main(String[] args)  {
		SpringApplication.run(RestSpringBootRhinoDemoApplication.class, args);
		
		//rhino.CallJsonFromJS();
		
	}
}
