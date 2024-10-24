package LLDParkingLot;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new NearEntranceParkingStrategy());
    }
}
