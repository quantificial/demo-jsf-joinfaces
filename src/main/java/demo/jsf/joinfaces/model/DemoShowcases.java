package demo.jsf.joinfaces.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Named
@RequestScoped
@Data
@Slf4j
public class DemoShowcases {

	public String navigation() {
		return "demo-view-scope-next";
	}
}
