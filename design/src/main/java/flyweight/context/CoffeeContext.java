package flyweight.context;

/**
 * Created by taesu- on 2016-06-27.
 */
public class CoffeeContext {
    private final int tableNumber;

    public CoffeeContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTable() {
        return this.tableNumber;
    }
}