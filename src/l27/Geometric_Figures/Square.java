package l27.Geometric_Figures;

import l27.GeometricFigures;

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
    @Override
        public void draw() {
            System.out.println("Рисуем квадрат");
    }
    @Override
    public void fill() {
        System.out.println("Закрашиваем квадрат");
    }

}
