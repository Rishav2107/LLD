package LLDParkingLot;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(int id, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
