package hust.itss.EcoBikeRental.respository;

import hust.itss.EcoBikeRental.entity.CreditCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends MongoRepository<CreditCard, String> {
    CreditCard findByCardHolderAndCodeAndExpDate(String cardHolder, String code, String expDate);
}
