package hust.itss.EcoBikeRental.controller;

import hust.itss.EcoBikeRental.dto.bike.*;
import hust.itss.EcoBikeRental.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/bike")
public class BikeController {
    @Autowired
    BikeService bikeService;

    @GetMapping("/{bikeId}")
    public ResponseEntity<GetBikeByIdResponse> getBikeById(@PathVariable String bikeId) {
        GetBikeByIdResponse response = bikeService.getBikeById(bikeId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/barcode")
    public ResponseEntity<GetBikeByBarcodeResponse> getBikeByBarcode(@RequestParam String barcode) {
        GetBikeByBarcodeResponse response = bikeService.getBikeByBarcode(barcode);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }

    @PostMapping("/return-bike")
    public ResponseEntity<ReturnBikeResponse> returnBike(@RequestBody ReturnBikeRequest request) {
        ReturnBikeResponse response = bikeService.returnBike(request);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }

    @PostMapping("/rent-bike/{bikeId}")
    public ResponseEntity<RentBikeResponse> rentBike(@PathVariable String bikeId, @RequestBody CreditCardInfo request) {
        RentBikeResponse response = bikeService.rentBike(bikeId, request);
        return new ResponseEntity<>(response, response.getHttpStatus());
    }
    
    @GetMapping("/station/{station}")
    public ResponseEntity<GetListBikeByStationResponse> getListBikeByStation(@PathVariable String station) {
        GetListBikeByStationResponse response = bikeService.getListBikeByStation(station);
        return ResponseEntity.ok(response);
    }


}
