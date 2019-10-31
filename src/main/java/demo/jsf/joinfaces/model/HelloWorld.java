package demo.jsf.joinfaces.model;

import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import lombok.Data;

@Named // use cdi managed bean
@RequestScoped // use cdi request scope
@Data
public class HelloWorld implements Serializable {

	private static final long serialVersionUID = 3319622763326151979L;
	
	private String firstName = "default first name";
	private String lastName = "default last name";
	private String value = "default value";


	public String showGreeting() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.CHINESE);

		return "Hello " + authentication.getName() + "!";
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
