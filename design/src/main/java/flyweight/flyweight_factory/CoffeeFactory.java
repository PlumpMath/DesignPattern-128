package flyweight.flyweight_factory;

import flyweight.concreate_flyweight.Coffee;

import java.util.HashMap;

/**
 * Created by taesu- on 2016-06-27.
 */
public class CoffeeFactory {
    private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);

        if (flavor == null) {
            flavor = new Coffee(flavorName);
            flavors.put(flavorName, flavor);
        }

        return flavor;
    }

    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}