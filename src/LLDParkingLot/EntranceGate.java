package LLDParkingLot;

import java.util.ArrayList;
import java.util.List;

public class EntranceGate {

    private ParkingSpotManagerFactory factory;
    ParkingSpotManager parkingSpotManager;

    public EntranceGate(ParkingSpotManagerFactory factory, Vehicle vehicle) {
        this.factory = factory;
    }

    private ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        parkingSpotManager = factory.getParkingSpotManager(vehicleType, spots);
        return parkingSpotManager.findParkingSpot(vehicleType);
    }

    public void bookSpot(Vehicle vehicle){
        parkingSpotManager.parkVehicle(findParkingSpace(VehicleType.TWO_WHEELER,new ArrayList<>()),vehicle);
    }

    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        return null;
    }

}
