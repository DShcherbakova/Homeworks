package l26.Geometric_Figures;

import l26.GeometricFigures;

public class Parallelogram extends GeometricFigures{

    private double side1; //длина большой полуоси
    private double side2; //длина малой полуоси

    public Parallelogram(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {

        return Math.PI * side1 * side2;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI;
    }
}
