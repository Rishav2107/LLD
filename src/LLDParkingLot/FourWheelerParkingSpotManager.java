package LLDParkingLot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new NearExitParkingStrategy());
    }
}

