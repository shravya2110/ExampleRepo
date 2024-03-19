package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker sp;
	@Autowired
	public TextEditor(SpellChecker sp) {
		this.sp=sp;
	}
	public SpellChecker getSp() {
		return sp;
	}
	public void setSp(SpellChecker sp) {
		this.sp=sp;
	}
	void showTextEditor() {
		System.out.println("This is method of TX");
		sp.showSpelling();
	}

}
