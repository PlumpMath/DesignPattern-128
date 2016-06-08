package com.hucet.decorator;

/**
 * Created by taesu- on 2016-06-08.
 */
public class DecorationPattern {
    public static void main(String[] ar) {
        BeverageDecorator beverageDecorator = new BeverageDecorator(new Espresso());

        System.out.println("========== Beverage ========");
        System.out.print("cost = ");
        System.out.println(beverageDecorator.cost());
        System.out.print("Description = ");
        System.out.println(beverageDecorator.getDescription());
        System.out.print("!!!! Decoration function locale = ");
        System.out.println(beverageDecorator.getLocale());

    }
}
