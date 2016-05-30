package com.bridge.main.abstraction;

/**
 * Created by taesu- on 2016-05-30.
 */

/**
 * "Abstraction"
 */
public interface Shape {
    public void draw();                                            // low-level

    public void resizeByPercentage(double pct);     // high-level
}