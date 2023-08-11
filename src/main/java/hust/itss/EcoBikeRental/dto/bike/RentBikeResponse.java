package hust.itss.EcoBikeRental.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class RentBikeResponse {
    HttpStatus httpStatus;
    private String message;
}
