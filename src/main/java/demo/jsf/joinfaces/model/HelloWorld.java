package demo.jsf.joinfaces.model;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Named // use cdi managed bean
@ViewScoped
@Data
@Slf4j
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 3319622763326151979L;
	
	private String firstName = "default first name";
	private String lastName = "default last name";
	private String value = "default value";
	
	private String message = "";
		

	public void processMessage() {
		
		log.info("message: {}", this.message);
		
		String safe = Jsoup.clean(this.message, Whitelist.basic());
		
		log.info("jsoup: {}", safe);
		
		this.message = safe;		
	}
	
	public String showGreeting() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.CHINESE);

		return "Hello " + authentication.getName() + "!" + " " + message;
	}

	@Autowired
	HttpSession httpSession;

	public String getSessionId() {

		return httpSession.getId();
	}

	public String getSessionValue() {

		String secret = (String) httpSession.getAttribute("secret");

		if (secret == null)
			secret = "empty";

		return secret;
	}

	public boolean assignSession() {

		httpSession.setAttribute("secret", this.value);

		System.out.println("setting secret session");

		return true;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
}
