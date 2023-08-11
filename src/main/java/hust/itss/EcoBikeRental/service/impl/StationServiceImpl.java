package hust.itss.EcoBikeRental.service.impl;

import hust.itss.EcoBikeRental.dto.station.GetListStationResponse;
import hust.itss.EcoBikeRental.dto.station.GetStationByIdResponse;
import hust.itss.EcoBikeRental.entity.Station;
import hust.itss.EcoBikeRental.respository.StationRepository;
import hust.itss.EcoBikeRental.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {
    @Autowired
    StationRepository stationRepository;

    @Override
    public GetListStationResponse getListStation(String location) {

        List<Station> stations = stationRepository.findByLocationContainingIgnoreCase(location);

        GetListStationResponse response = new GetListStationResponse();
        response.setStations(stations);

        return response;
    }

    @Override
    public GetStationByIdResponse getStationById(String id) {
        Station station = stationRepository.findById(id).orElseThrow();
        GetStationByIdResponse response = new GetStationByIdResponse();
        response.setStation(station);
        return response;
    }
}
