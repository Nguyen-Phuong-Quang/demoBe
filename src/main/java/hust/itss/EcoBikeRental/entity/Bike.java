package hust.itss.EcoBikeRental.entity;

import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import org.bson.BsonTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.Date;


@Document("bikes")
@Data
public class Bike {
    @Id
    private String id;
    private String color;
    private String station;
    private String type;
    private Date rentTime;
    private int battery;
    private String barcode;
    private Boolean status;
    private Double value;
}
