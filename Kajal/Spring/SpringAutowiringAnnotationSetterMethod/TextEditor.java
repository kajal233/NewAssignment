package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

// 1. type : autowrinig using setter metod based method mode

// 

public class TextEditor {
	
	
	public SpellChecker spellChecker;  // this is HAS- relation ship from core java concept

	
	
	
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		
		this.spellChecker = spellChecker;
	}
	

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}


	// this method belongs to TextEditor clas
	
	public void spellCheck() {
		//calling spellchecker class
		spellChecker.checkSpelling();     // try to call anoth class funtionality here due have HAS -Relation ship
	}
	

}
