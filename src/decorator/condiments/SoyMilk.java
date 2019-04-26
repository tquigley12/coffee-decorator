package decorator.condiments;

import decorator.Beverage;
import decorator.BeverageDecorator;

public class SoyMilk extends BeverageDecorator {

    public SoyMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .99;
    }
}
