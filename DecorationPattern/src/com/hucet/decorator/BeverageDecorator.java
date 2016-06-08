package com.hucet.decorator;

/**
 * Created by taesu- on 2016-06-08.
 */
public class BeverageDecorator implements CondimentComponent {

    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }

    // Decoration getLocale
    @Override
    public String getLocale() {
        return "korea";
    }
}
