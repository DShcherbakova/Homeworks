package l27.Geometric_Figures;

import l27.GeometricFigures;

public class Triangle extends GeometricFigures{

    private double base;
    private double side;
    private double height;


    public Triangle(String color, double base, double side, double height) {
        super(color);
        this.base = base;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {

        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {

        return base + (side * 2);
    }
    @Override
    public void draw(){
        System.out.println("Рисуем треугольник");
    }
    @Override
    public void fill() {
        System.out.println("Закрашиваем треугольник");
    }
}
