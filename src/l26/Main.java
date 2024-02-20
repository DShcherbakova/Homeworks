package l26;

import l26.Geometric_Figures.*;

public class Main {
    public static void main(String[] args) {
        GeometricFigures[] geometricF = {
                new Circle("Yellow", 7),
                new Square("Red", 4),
                new Rectangle("Blue", 5, 4),
                new Triangle("White", 6, 5, 4),
                new Rhombus("Orange", 4, 5, 5)
        };

        for (GeometricFigures geometricFigures : geometricF) {
            geometricFigures.printInfo();
            System.out.println();
        }
    }
}
