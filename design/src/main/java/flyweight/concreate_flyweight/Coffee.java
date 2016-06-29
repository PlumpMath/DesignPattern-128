package flyweight.concreate_flyweight;

import flyweight.context.CoffeeContext;
import flyweight.flayweight.ICoffee;

/**
 * Created by taesu- on 2016-06-27.
 */
public class Coffee implements ICoffee {

    // this is intrinsic
    private final String flavor;

    public Coffee(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + flavor + " to table "
                + context.getTable());
    }

}