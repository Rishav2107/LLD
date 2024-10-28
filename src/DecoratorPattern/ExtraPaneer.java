package DecoratorPattern;

public class ExtraPaneer extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraPaneer(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int getPrice() {
        return this.basePizza.getPrice() + 30;
    }
}
