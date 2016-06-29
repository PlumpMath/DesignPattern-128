package flyweight;

import flyweight.concreate_flyweight.Coffee;
import flyweight.context.CoffeeContext;
import flyweight.flyweight_factory.CoffeeFactory;

/**
 * Created by taesu- on 2016-06-27.
 */

//의도
//        - 수많은 작은 객체들을 효과적으로 설계하기 위해 객체를 공유하기
//    사용되는 많은 객체의 생성 관리하는 객체를 따로 두어
// 이를 통해 필요한 객체를 참조형태로 사용하도록
//     본질적인 것과 부가적인 것을 구분하려 할 때 사용
// 응용 프로그램이 객체들을 서로 구분할 필요가 없을 때
public class Main {
    private static Coffee[] coffees = new Coffee[20];
    private static CoffeeContext[] tables = new CoffeeContext[20];
    private static int ordersCount = 0;
    private static CoffeeFactory coffeeFactory;

    public static void takeOrder(String flavorIn, int table) {
        coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
        tables[ordersCount] = new CoffeeContext(table);
        ordersCount++;
    }

    public static void main(String args[]) {
        coffeeFactory = new CoffeeFactory();

        takeOrder("Cappuccino", 2);
        takeOrder("Cappuccino", 2);
        takeOrder("Regular Coffee", 1);
        takeOrder("Regular Coffee", 2);
        takeOrder("Regular Coffee", 3);
        takeOrder("Regular Coffee", 4);
        takeOrder("Cappuccino", 4);
        takeOrder("Cappuccino", 5);
        takeOrder("Regular Coffee", 3);
        takeOrder("Cappuccino", 3);

        for (int i = 0; i < ordersCount; i++) {
            coffees[i].serveCoffee(tables[i]);
        }

        System.out.println("\n Total Coffee objects made: "
                + coffeeFactory.getTotalCoffeeFlavorsMade());
    }
}
