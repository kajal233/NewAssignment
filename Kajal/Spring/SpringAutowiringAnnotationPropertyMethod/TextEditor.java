package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	// Spring @Autowired Annotation and @Qualifier Bean autowiring by property mode

	@Autowired
	SpellChecker spellChecker;

	void myTextEditor() {

		spellChecker.ankit();

	}

}
