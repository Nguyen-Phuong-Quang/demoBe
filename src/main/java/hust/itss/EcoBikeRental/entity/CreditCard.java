package hust.itss.EcoBikeRental.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("credit_cards")
public class CreditCard {
    @Id
    private String id;
    private String cardHolder;
    private String code;
    private String expDate;
    private double balance;
}
