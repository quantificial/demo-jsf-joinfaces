package demo.jsf.joinfaces.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;

@Named @RequestScoped @Data
public class Books {
	
	private String title;
	private String author;
	private String output;

	public String generateOutput() {
		return "the book name is: " + title;
	}
	
	public void submit() {
		this.output = this.generateOutput();
	}

}
