package hust.itss.EcoBikeRental.entity;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("stations")
@Data
public class Station {
    @Id
    private String id;
    private int maxDock;
    private String location;
    private List<String> bikes;
}
