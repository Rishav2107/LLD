package LLDParkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots){
        if(vehicleType == VehicleType.TWO_WHEELER)
            return new TwoWheelerParkingSpotManager(spots);
        else
            return new FourWheelerParkingSpotManager(spots);
    }
}
