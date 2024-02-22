package l27.Geometric_Figures;

import l27.GeometricFigures;
public class Rhombus extends GeometricFigures{

    private double diagonal1;
    private double diagonal2;
    private double side;


    public Rhombus(String color, double diagonal1, double diagonal2, double side) {
        super(color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;

    }

    @Override
    public double getArea() {

        return diagonal1 * diagonal2;
    }

    @Override
    public double getPerimeter() {

        return 4 * side;
    }
    @Override
    public void draw(){
        System.out.println("Рисуем ромб");
    }
    @Override
    public void fill() {
        System.out.println("Закрашиваем ромб");
    }

}
