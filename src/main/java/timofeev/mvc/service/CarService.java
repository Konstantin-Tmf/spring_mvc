package timofeev.mvc.service;

import timofeev.mvc.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(List<Car> list, Integer count);
}
