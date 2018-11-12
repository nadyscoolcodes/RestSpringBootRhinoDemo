package com.unique.service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unique.entity.LetterOfCredit;
import com.unique.repository.LetterOfCreditRepository;
import com.unique.rhino.RhinoClass;

@Service
public class LetterOfCreditService {

	@Autowired
	LetterOfCreditRepository lRepository;

	@Autowired
	RhinoClass rh;



	public List<LetterOfCredit> getLCservice() {
		List<LetterOfCredit> lc = new ArrayList<>();
		lRepository.findAll().forEach(lc::add);
		System.out.println("The LC Received " + lc);
		return lc;
	}

	public void addLCservice(LetterOfCredit lc) throws FileNotFoundException, NoSuchMethodException, ScriptException {
		System.out.println("The LC " + lc);
		String confirmationString = rh.RhinoConfirmation();

		if (confirmationString.equals("yes")) {
			lRepository.save(lc);
		}

	}

	public Object rhinoService() throws FileNotFoundException, NoSuchMethodException, ScriptException {
		return rh.jsonFromJavaScript();
		
	}

	

}
