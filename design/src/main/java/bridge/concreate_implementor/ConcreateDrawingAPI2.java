package bridge.concreate_implementor;

import bridge.implementor.DrawingAPI;

public class ConcreateDrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("drawCircle2 at %f:%f radius %f\n", x, y, radius);
    }
}
