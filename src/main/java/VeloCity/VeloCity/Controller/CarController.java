package VeloCity.VeloCity.Controller;


import VeloCity.VeloCity.Model.Car;
import VeloCity.VeloCity.Repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CarController {

    CarRepository carRepository;

    @GetMapping("/car/{id}")
    public String car(@RequestParam int id, Model model) {
        Optional<Car> car = carRepository.findById((long) id);
        model.addAttribute("car", car);
        return "/car";
    }
}
