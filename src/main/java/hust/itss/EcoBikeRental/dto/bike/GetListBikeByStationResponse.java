package hust.itss.EcoBikeRental.dto.bike;

import hust.itss.EcoBikeRental.entity.Bike;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class GetListBikeByStationResponse {
    List<Bike> bikes;
}
