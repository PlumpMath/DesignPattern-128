package composite.leaf;

import composite.composite.Graphic;

/**
 * Created by 태수1 on 2016-06-13.
 */
public class Ellipse implements Graphic {
    private String print;

    public Ellipse(String print) {
        this.print = print;
    }

    //Prints the graphic.
    public void print() {
        System.out.println(print);
    }

}
