package demo.jsf.joinfaces.model;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Named
@SessionScoped
@Data
@Slf4j
public class Counter {

	private int counter = 0;
	
	@PostConstruct
	private void init() {
		
	}
	
	
	public int increment() {
		log.info("counter was called. {} ", counter);
		counter++;
		return counter;
	}
}
