package VeloCity.VeloCity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RentController {
    @GetMapping("/rent")
    public String rent() {
        return "/rent";
    }
}