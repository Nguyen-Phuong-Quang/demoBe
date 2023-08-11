package hust.itss.EcoBikeRental.dto.station;

import hust.itss.EcoBikeRental.entity.Station;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetStationByIdResponse {
    Station station;
}
