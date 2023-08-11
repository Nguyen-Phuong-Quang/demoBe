package hust.itss.EcoBikeRental.respository;

import hust.itss.EcoBikeRental.entity.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends MongoRepository<Bike, String> {
    List<Bike> findByStation(String station);
    Bike findByBarcode(String barcode);
}
