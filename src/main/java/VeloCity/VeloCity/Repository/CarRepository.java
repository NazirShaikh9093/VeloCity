package VeloCity.VeloCity.Repository;


import VeloCity.VeloCity.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

}

