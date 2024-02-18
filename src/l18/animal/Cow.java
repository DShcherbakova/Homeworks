package l18.animal;

import java.util.Scanner;

public class Cow {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у коров?");
        System.out.println("(Подсказка - 120)");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }
    public Cow(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Cow " + this.name + ", " + "возраст - " + age + ", " + "хромосом - " + chromosomNumber;
    }
}