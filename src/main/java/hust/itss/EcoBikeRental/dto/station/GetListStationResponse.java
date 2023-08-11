package hust.itss.EcoBikeRental.dto.station;

import hust.itss.EcoBikeRental.entity.Station;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class GetListStationResponse {
    List<Station> stations;
}
