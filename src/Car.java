public class Car implements Engine{
    @Override
    public boolean hasEngine() {
        return false;
    }

    @Override
    public void display() {
        System.out.println("Car...");
    }

    public void method(){

    }
}
