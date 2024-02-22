package l27.Geometric_Figures;

import l27.GeometricFigures;

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
    @Override
    public void draw(){
        System.out.println("Рисуем прямоугольник");
    }
    @Override
    public void fill() {
        System.out.println("Закрашиваем прямоугольник");
    }
    @Override
    public void resize(){
        size();
    }
    public void size(){
        System.out.println("Размер останется прежним");
    }
}
