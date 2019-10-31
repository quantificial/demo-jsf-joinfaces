package demo.jsf.joinfaces.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import demo.jsf.joinfaces.database.dao.MessageRepository;
import demo.jsf.joinfaces.database.model.Message;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Named @RequestScoped @Data @Slf4j
public class ComponentHub {
	
	private String message;

	public void submit() {
		// processing
		
		log.info(this.message);
		
	}
}
