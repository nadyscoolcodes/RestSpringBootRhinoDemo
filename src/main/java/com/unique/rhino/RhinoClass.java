package com.unique.rhino;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.stereotype.Component;

@Component
public class RhinoClass {

	public String RhinoConfirmation() throws FileNotFoundException, ScriptException, NoSuchMethodException {
		File jsFile = new File("./JsFile.js");
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine jsEngine = factory.getEngineByName("javascript");
		jsEngine.put("out", System.out);
		Reader reader = new FileReader(jsFile);
		jsEngine.eval(reader);
		Invocable invocableEngine = (Invocable) jsEngine;
		String s = (String) invocableEngine.invokeFunction("myfunction");
		System.out.println("Return" + s);
		return s;
	}

	public Object jsonFromJavaScript() throws FileNotFoundException, ScriptException, NoSuchMethodException {
		File jsFile = new File("./Json1.js");
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine jsEngine = factory.getEngineByName("javascript");
		jsEngine.put("out", System.out);
		Reader reader = new FileReader(jsFile);
		jsEngine.eval(reader);
		Invocable invocableEngine = (Invocable) jsEngine;
		return invocableEngine.invokeFunction("myfunction");
	}

	/*
	 * public void CallJsonFromJS() throws FileNotFoundException, ScriptException,
	 * NoSuchMethodException {
	 * 
	 * File jsFile = new File("./Json1.js");
	 * 
	 * ScriptEngineManager factory = new ScriptEngineManager(); ScriptEngine
	 * jsEngine = factory.getEngineByName("javascript"); jsEngine.put("out",
	 * System.out); Reader reader = new FileReader(jsFile);
	 * 
	 * jsEngine.eval(reader); System.out.println(
	 * "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"
	 * ); Invocable invocableEngine = (Invocable) jsEngine;
	 * invocableEngine.invokeFunction("myfunction");
	 * 
	 * 
	 * }
	 */

}
