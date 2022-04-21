package pl.Uk4szenk0.Car.shop.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    Car findCarById(Long id);

    List<Car> findByName(String name);

    List<Car> findByNameAndModel(String name, String model);
}
