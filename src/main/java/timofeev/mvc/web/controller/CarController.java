package timofeev.mvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import timofeev.mvc.model.Car;
import timofeev.mvc.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                         Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Jetta", "blue"));
        cars.add(new Car("Audi", "A7", "green"));
        cars.add(new Car("Mercedes","600", "black"));
        cars.add(new Car("Lada", "Granta", "yellow"));
        cars.add(new Car("Renault", "Logan", "red"));
        model.addAttribute("cars", carService.getCarList(cars, count));

        return "cars";
    }
}
