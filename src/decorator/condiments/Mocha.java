package decorator.condiments;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .99;
    }

}
