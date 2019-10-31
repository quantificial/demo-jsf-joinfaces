package demo.jsf.joinfaces.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import demo.jsf.joinfaces.database.dao.MessageRepository;
import demo.jsf.joinfaces.database.model.Message;
import lombok.Data;

@Named @RequestScoped @Data
public class MessageHub {
	
	private Message message = new Message();
	
	private List<Message> messageList;
	
	@Autowired
	private MessageRepository messageRepository;
	
	@PostConstruct
	public void init() {
		messageList = messageRepository.findAll();
	}
	
	public void submit() {
		messageRepository.save(message);
		messageList.add(message);
		
	}
	
	public Message getMessage() {
		return this.message;
	}
	
	public List<Message> getMessageList() {
		return this.messageList;
	}
	

}
