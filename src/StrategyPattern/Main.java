package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicleObj = new Audi(new SportDriveStrategy());
        vehicleObj.drive();
    }
}
