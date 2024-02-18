package l24;

import l24.animal.*;
import l24.people.*;
import l24.transport.*;


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
        System.out.println(macho.equals(murka));
        System.out.println(macho.hashCode());

        System.out.println(murka);
        System.out.println(murka.equals(diego));
        System.out.println(murka.hashCode());

        System.out.println(diego);
        System.out.println(diego.equals(macho));
        System.out.println(diego.hashCode());

        System.out.println(viktor);
        System.out.println(viktor.equals(nikopol));
        System.out.println(viktor.hashCode());

        System.out.println(nikopol);
        System.out.println(nikopol.equals(viktor));
        System.out.println(nikopol.hashCode());

        System.out.println(cyclone);
        System.out.println(cyclone.equals(lotos));
        System.out.println(cyclone.hashCode());

        System.out.println(lotos);
        System.out.println(lotos.equals(lamborghini));
        System.out.println(lotos.hashCode());


        System.out.println(lamborghini);
        System.out.println(lamborghini.equals(cyclone));
        System.out.println(lamborghini.hashCode());
    }
}
