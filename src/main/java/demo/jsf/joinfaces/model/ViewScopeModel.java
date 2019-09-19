package demo.jsf.joinfaces.model;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Named
@Data
@ViewScoped
public class ViewScopeModel {
	
	
	private String username;
	
	private String userBasicInformation;
	
	
	public void displayLog() {
		
		System.out.println("username: " + this.username);
		
	}

}
