package StrategyPattern;

public class Nano extends Vehicle{
    DriveStrategy driveStrategy;
    Nano( DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    @Override
    public void drive(){
        driveStrategy.drive();
    }
}