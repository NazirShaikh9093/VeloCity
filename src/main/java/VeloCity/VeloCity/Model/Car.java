package VeloCity.VeloCity.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;


@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String description;
    private float price;
    private String transmission;
    private int seats;
    private int quantity;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private boolean available;

    public Car() {}
}