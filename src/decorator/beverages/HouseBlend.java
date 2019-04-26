package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
