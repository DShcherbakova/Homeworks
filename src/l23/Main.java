package l23;

import l23.animal.*;
import l23.people.*;
import l23.transport.*;


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
        macho.applySkill();

        System.out.println(murka);
        murka.applySkill();

        System.out.println(diego);
        diego.goStartOfMovement();

        System.out.println(viktor);
        viktor.playGames();
        System.out.println(nikopol);
        nikopol.applySkill();

        System.out.println(cyclone);
        cyclone.goStartOfMovement1();

        System.out.println(lotos);
        lotos.goStartOfMovement();

        System.out.println(lamborghini);
        lamborghini.goStartOfMovement();
    }
}
