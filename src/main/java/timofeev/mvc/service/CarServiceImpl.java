package timofeev.mvc.service;

import timofeev.mvc.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(List<Car> list, Integer count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
