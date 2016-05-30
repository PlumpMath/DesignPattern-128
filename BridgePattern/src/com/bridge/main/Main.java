package com.bridge.main;

import com.bridge.main.abstraction.Shape;
import com.bridge.main.comcreate_implementor.ConcreateDrawingAPI;
import com.bridge.main.comcreate_implementor.ConcreateDrawingAPI2;
import com.bridge.main.redefine_abstraction.CircleShape;

public class Main {

    // 확장 설계에 용이하다.
    // 
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, 2, 3, new ConcreateDrawingAPI());
        shapes[1] = new CircleShape(5, 7, 11, new ConcreateDrawingAPI2());

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
