package com.hucet.decorator;

/**
 * Created by taesu- on 2016-06-08.
 */
public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}