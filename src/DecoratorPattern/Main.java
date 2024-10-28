package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraPaneer(new ExtraCheese(new Margherita()));
        System.out.println(basePizza.getPrice());
    }
}
