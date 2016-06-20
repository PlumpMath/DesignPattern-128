package composite;

import composite.component.CompositeGraphic;
import composite.leaf.Ellipse;

public class Main {
    //사용자가 단일 객체와 복합 객체 모두 동일하게 다루도록 한다.
    public static void main(String[] args) {
        Ellipse ellipse1 = new Ellipse("Object 1");
        Ellipse ellipse2 = new Ellipse("Object 2");
        Ellipse ellipse3 = new Ellipse("Object 3");
        Ellipse ellipse4 = new Ellipse("Object 4");

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (four times the string "composite.leaf.Ellipse").
        graphic.print();
    }
}
