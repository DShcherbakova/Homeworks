package l21;
import l21.transport.Car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw", 2);
        Car porsche = new Car("Porsche", 2);
        Car lamborghini = new Car("Lamborghini", 3);
        Car ford = new Car("Ford", 3);
        Car ferrari = new Car("Ferrari", 3);

        MyArrayList carShowroom = new MyArrayList();

        carShowroom.add(bmw);
        carShowroom.add(porsche);
        carShowroom.add(lamborghini);
        carShowroom.add(ford);
        carShowroom.add(ferrari);
        System.out.println(carShowroom);
    }
}
