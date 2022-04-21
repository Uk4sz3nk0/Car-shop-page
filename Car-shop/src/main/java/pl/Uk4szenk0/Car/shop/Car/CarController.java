package pl.Uk4szenk0.Car.shop.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;


import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carrepo;

    @GetMapping(value = "")
    public String findAll(Model model){
        model.addAttribute("cars", carrepo.findAll());
        return "Subpages/cars";
    }

    @GetMapping("/carbyid/{id}")
    public String findCarById(@PathVariable Long id, Model model){
        model.addAttribute("cars", carrepo.findCarById(id));
        return "Subpages/car";
    }

    @GetMapping("/{name}")
    public List<Car> findCarByName(@PathVariable String name){
        return carrepo.findCarByName(name);
    }

    @GetMapping("/{name}/{model}")
    public List<Car> findByNameAndModel(@PathVariable String name, @PathVariable String model){
        return carrepo.findByNameAndModel(name, model);
    }

    // POST

}
