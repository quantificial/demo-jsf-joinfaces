package demo.jsf.joinfaces.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import demo.jsf.joinfaces.entity.Car;
import demo.jsf.joinfaces.repository.CarRepository;

@Named
@ViewScoped
public class CarController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3219337491783037177L;
	
	@Inject
	private CarRepository carRepository;
	
	private List<Car> cars;
	
	@PostConstruct
	public void init() {
		cars = carRepository.findAll();
	}
	
	@PreDestroy
	void exit() {
	}
	
	public List<Car> getCars() {
		return cars;
	}
	
}
