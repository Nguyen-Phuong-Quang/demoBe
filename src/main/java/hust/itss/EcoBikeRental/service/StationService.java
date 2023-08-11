package hust.itss.EcoBikeRental.service;

import hust.itss.EcoBikeRental.dto.station.GetListStationResponse;
import hust.itss.EcoBikeRental.dto.station.GetStationByIdResponse;

public interface StationService {
    GetListStationResponse getListStation(String location);
    GetStationByIdResponse getStationById(String id);
}
