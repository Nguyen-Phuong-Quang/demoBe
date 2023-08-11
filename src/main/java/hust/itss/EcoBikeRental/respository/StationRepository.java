package hust.itss.EcoBikeRental.respository;

import hust.itss.EcoBikeRental.entity.Station;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends MongoRepository<Station, String> {
    List<Station> findByLocationContainingIgnoreCase(String location);
}
