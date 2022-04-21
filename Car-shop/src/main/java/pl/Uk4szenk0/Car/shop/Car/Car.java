package pl.Uk4szenk0.Car.shop.Car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String model;
    private String short_description;
    private int production_year;
    private int mileage;
    private int engine_capacity;
    private String fuel_type;
    private String localization;

}
