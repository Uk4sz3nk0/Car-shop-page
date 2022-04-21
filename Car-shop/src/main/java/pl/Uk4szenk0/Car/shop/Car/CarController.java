package pl.Uk4szenk0.Car.shop.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

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

    @GetMapping("/carsbyid/{id}")
    public Car findCarById(@PathVariable Long id){
        return carrepo.findCarById(id);
    }

    @GetMapping("/{name}")
    public List<Car> findCarByName(@PathVariable String name){
        return carrepo.findCarByName(name);
    }

    @GetMapping("/{name}/{model}")
    public List<Car> findByNameAndModel(@PathVariable String name, @PathVariable String model){
        return carrepo.findByNameAndModel(name, model);
    }
}
