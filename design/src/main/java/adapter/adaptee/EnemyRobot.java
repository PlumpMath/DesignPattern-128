package adapter.adaptee;

import java.util.Random;

/**
 * Created by taesu- on 2016-05-26.
 */
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);

    }


}