package l27.Geometric_Figures;

import l27.GeometricFigures;

public class Circle extends GeometricFigures{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем круг");
    }
    @Override
    public void fill() {
        System.out.println("Закрашиваем круг");
    }
}
