package com.unique.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unique.entity.LetterOfCredit;
import com.unique.service.LetterOfCreditService;

@RestController
public class LetterOfCreditController {

	@Autowired
	LetterOfCreditService lService;

	@RequestMapping(method = RequestMethod.GET, value = "lc")
	public List<LetterOfCredit> getLC() {
		List<LetterOfCredit> lc = new ArrayList<>();
		lc = lService.getLCservice();
		return lc;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/lc")
	public void addLC(@RequestBody LetterOfCredit lc)
			throws FileNotFoundException, NoSuchMethodException, ScriptException {

		lService.addLCservice(lc);
	}

	@RequestMapping(method = RequestMethod.GET, value = "getLc")
	public Object callRhino() throws FileNotFoundException, NoSuchMethodException, ScriptException {
		
		

		return lService.rhinoService();

	}

}
