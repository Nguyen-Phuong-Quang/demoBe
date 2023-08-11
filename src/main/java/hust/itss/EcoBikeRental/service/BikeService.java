package hust.itss.EcoBikeRental.service;

import hust.itss.EcoBikeRental.dto.bike.*;

public interface BikeService {
    GetListBikeByStationResponse getListBikeByStation(String station);
    GetBikeByIdResponse getBikeById(String id);
    RentBikeResponse rentBike(String id, CreditCardInfo request);
    GetBikeByBarcodeResponse getBikeByBarcode(String barcode);
    ReturnBikeResponse returnBike(ReturnBikeRequest request);
}
