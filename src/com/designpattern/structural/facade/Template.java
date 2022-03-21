package com.designpattern.structural.facade;

public abstract class Template {

	public enum TemplateType {
		Email, NewsLetter
	};

	public abstract String format(Object obj);

}
