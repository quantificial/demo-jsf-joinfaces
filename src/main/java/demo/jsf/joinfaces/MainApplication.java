package demo.jsf.joinfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.jsf.joinfaces.database.dao.MessageRepository;
//import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;
import demo.jsf.joinfaces.database.model.Message;

@SpringBootApplication
//@EnableHazelcastHttpSession
public class MainApplication implements CommandLineRunner {
	
	@Autowired
	MessageRepository messageRepository;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Message message = new Message();
		message.setId(10L);
		message.setText("this is the message");
		
		messageRepository.save(message);

	}
}
