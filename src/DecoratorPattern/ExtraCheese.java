package DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int getPrice() {
        return this.basePizza.getPrice() + 15;
    }
}
