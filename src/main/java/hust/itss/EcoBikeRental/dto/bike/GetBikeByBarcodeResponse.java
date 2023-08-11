package hust.itss.EcoBikeRental.dto.bike;

import hust.itss.EcoBikeRental.entity.Bike;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class GetBikeByBarcodeResponse {
    HttpStatus httpStatus;
    String message;
    Bike bike;

    public GetBikeByBarcodeResponse(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

}
