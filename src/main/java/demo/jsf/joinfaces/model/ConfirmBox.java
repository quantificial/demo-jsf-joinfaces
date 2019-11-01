package demo.jsf.joinfaces.model;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Named
@SessionScoped
@Data
@Slf4j
public class ConfirmBox {
	
	public void confirm() {
		addMessage("Delete record", "Record has been deleted.");
	}

	public void addMessage(String summary, String detail) {
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
	}
}
