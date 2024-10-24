package LLDParkingLot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;
    protected ParkingSpotManager(List<ParkingSpot> parkingSpotList,ParkingStrategy parkingStrategy){
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }
    public void addParkingSpot(){
        //add new spots to list
    }
    public ParkingSpot findParkingSpot(VehicleType vehicleType){
        return this.parkingStrategy.find();
    }
    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }
    public void parkVehicle(ParkingSpot parkingSpot ,Vehicle vehicle){
        parkingSpot.setEmpty(false);
        parkingSpot.setVehicle(vehicle);

    }
    public void removeVehicle(ParkingSpot parkingSpot){
        parkingSpot.setEmpty(true);
        parkingSpot.setVehicle(null);
    }
}
