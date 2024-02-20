package l26.Geometric_Figures;

import l26.GeometricFigures;

public class Square extends GeometricFigures{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public double getPerimeter() {

        return 4 * side;
    }
}
