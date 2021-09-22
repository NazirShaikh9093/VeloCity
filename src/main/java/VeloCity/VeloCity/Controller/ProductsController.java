package VeloCity.VeloCity.Controller;

import VeloCity.VeloCity.Model.Car;
import VeloCity.VeloCity.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProductsController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/products")
    public String products(Model model) {
        Iterable<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars);
        return "/products";
    }


}
