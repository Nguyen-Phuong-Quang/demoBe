package hust.itss.EcoBikeRental.dto.bike;

import hust.itss.EcoBikeRental.entity.Bike;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetBikeByIdResponse {
    Bike bike;
}
