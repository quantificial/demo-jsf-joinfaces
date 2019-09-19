package demo.jsf.joinfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;

@SpringBootApplication
//@EnableHazelcastHttpSession
public class MainApplication {

  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);
  }
}
