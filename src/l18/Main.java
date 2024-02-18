package l18;
import l18.animal.*;
import l18.people.*;
import l18.transport.*;


public class Main {
    public static void main(String[] args) {
        Cat macho = new Cat("Macho", 4);
        Cow murka = new Cow("Murka", 2);
        Dog diego = new Dog("Diego", 3);
        Man viktor = new Man("Viktor", 29);
        Woman nikopol = new Woman("Nikopol", 24);
        Bike cyclone = new Bike("Cyclone", 2);
        Bus lotos = new Bus("Lotos", 3);
        Car lamborghini = new Car("Lamborghini", 3);

        System.out.println(macho);
        System.out.println(murka);
        System.out.println(diego);
        System.out.println(viktor);
        System.out.println(nikopol);
        System.out.println(cyclone);
        System.out.println(lotos);
        System.out.println(lamborghini);
    }
}
