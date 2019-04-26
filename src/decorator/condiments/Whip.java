package decorator.condiments;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .99;
    }

}
