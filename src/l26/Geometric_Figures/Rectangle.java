package l26.Geometric_Figures;

import l26.GeometricFigures;

public class Rectangle extends GeometricFigures{

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {

        return length * width;
    }

    @Override
    public double getPerimeter() {

        return 2 * (length + width);
    }
}
