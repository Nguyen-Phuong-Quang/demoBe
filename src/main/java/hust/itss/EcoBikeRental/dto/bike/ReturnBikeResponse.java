package hust.itss.EcoBikeRental.dto.bike;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ReturnBikeResponse {
    HttpStatus httpStatus;
    String message;
}
