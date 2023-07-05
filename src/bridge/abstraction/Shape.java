package bridge.abstraction;

import bridge.impl.Color;

public abstract class Shape {
    protected Color color; // bridge between Shape and Color

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
