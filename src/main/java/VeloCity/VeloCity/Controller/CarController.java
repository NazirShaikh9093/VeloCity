package VeloCity.VeloCity.Controller;


import VeloCity.VeloCity.Model.Car;
import VeloCity.VeloCity.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/car/{id}")
    public String car(@PathVariable long id, Model model) {
        Optional<Car> car = carRepository.findById(id);
        Car carObject = car.get();
        model.addAttribute("car", carObject);
        return "/car";
    }
}
