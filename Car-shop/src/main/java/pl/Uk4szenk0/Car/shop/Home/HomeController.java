package pl.Uk4szenk0.Car.shop.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.Uk4szenk0.Car.shop.Car.CarRepository;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private CarRepository carrepo;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("amountOfCars", carrepo.count());
        return "index";
    }
}
