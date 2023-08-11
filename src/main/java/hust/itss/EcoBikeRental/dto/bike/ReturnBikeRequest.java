package hust.itss.EcoBikeRental.dto.bike;

import lombok.Data;

@Data
public class ReturnBikeRequest {
    String bikeId;
    String stationId;
    CreditCardInfo creditCardInfo;
}
