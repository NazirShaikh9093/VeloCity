package VeloCity.VeloCity.Controller;

import VeloCity.VeloCity.Model.Car;
import VeloCity.VeloCity.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping("/signup")
    public String signup() {
        return "/signup";
    }

    @GetMapping("/signin")
    public String signin() {
        return "/signin";
    }
}