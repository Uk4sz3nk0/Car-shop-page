package pl.Uk4szenk0.Car.shop.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carrepo;

    @GetMapping
    public Iterable<Car> findAll(){
        return carrepo.findAll();
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
