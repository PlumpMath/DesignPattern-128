package com.hucet.adaptee;

import com.hucet.target.EnemyAttacker;

import java.util.Random;

/**
 * Created by taesu- on 2016-05-26.
 */
public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");

    }

    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");

    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}