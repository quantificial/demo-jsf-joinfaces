package demo.jsf.joinfaces.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import demo.jsf.joinfaces.entity.Car;
import demo.jsf.joinfaces.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CarRepositoryImpl implements CarRepository {
	
	private List<Car> data = new ArrayList<Car>();
	
	@PostConstruct
	void init() {
		/*
			  ('Mercedes', 1991, 'Brown'),
			  ('Fiat', 1962, 'Black'),
			  ('Renault', 1997, 'Brown'),
			  ('Renault', 1967, 'Maroon'),
			  ('Renault', 1986, 'Yellow'),
			  ('BMW', 1970, 'Maroon'),
			  ('Fiat', 1990, 'Silver'),
			  ('Renault', 1972, 'Black'); 
		 
		 */
		Car a = Car.builder().id(1L).brand("Audi").year(1992).color("Red").build();
		Car b = Car.builder().id(2L).brand("Fiat").year(2001).color("Red").build();
		Car c = Car.builder().id(3L).brand("Renault").year(1997).color("Brown").build();
		
		data.add(a);
		data.add(b);
		data.add(c);
	}
	
	@PreDestroy
	void exit() {
		
	}

	@Override
	public Car addCar(Car car) {
		data.add(car);
		return car;
	}

	@Override
	public List<Car> findAll() {
		return data;
	}

}
