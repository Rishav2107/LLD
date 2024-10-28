package StrategyPattern;

public class Audi extends Vehicle{
    DriveStrategy driveStrategy;
    Audi( DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    @Override
    public void drive(){
        driveStrategy.drive();
    }
}
