package demo.jsf.joinfaces.repository;

import java.util.List;

import demo.jsf.joinfaces.entity.Car;

public interface CarRepository {

	public Car addCar(Car car);
	public List<Car> findAll();
}
