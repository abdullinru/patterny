package bridge.abstraction;

import bridge.impl.Color;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("drawing triangle");
        color.fillColor();
    }
}
