package pl.Uk4szenk0.Car.shop.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carrepo;

    @GetMapping
    public Iterable<Car> findAll(){
        return carrepo.findAll();
    }
}
