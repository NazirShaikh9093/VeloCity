package VeloCity.VeloCity.Controller;

import VeloCity.VeloCity.Model.Car;
import VeloCity.VeloCity.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.xml.bind.SchemaOutputResolver;

@Controller
public class UserController {
    @GetMapping("/signup")
    public String signup() {
        return "/signup";
    }

    @GetMapping("/signin")
    public String signInPage() {
        return "/signin";
    }

    @PostMapping("/signInUser")
    public String signInUser() {
        return "/signup";
    }
}

