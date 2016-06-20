package facade;

import facade.subsystem.CirculSubSystem;
import facade.subsystem.SquartSubSystem;

/**
 * Created by taesu- on 2016-06-20.
 */
public class Main {
    // 단방향이며, Mediator 패턴과의 차이점.
    public static void main(String[] ar) {
        CirculSubSystem circulSubSystem = new CirculSubSystem();
        SquartSubSystem squartSubSystem = new SquartSubSystem();
        circulSubSystem.draw();
        squartSubSystem.draw();
    }
}
