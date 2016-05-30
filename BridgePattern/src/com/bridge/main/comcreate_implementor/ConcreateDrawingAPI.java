package com.bridge.main.comcreate_implementor;

/**
 * Created by taesu- on 2016-05-30.
 */

import com.bridge.main.implementor.DrawingAPI;

/**
 * "ConcreteImplementor" 1/2
 */
public class ConcreateDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("drawCircle at %f:%f radius %f\n", x, y, radius);
    }
}
