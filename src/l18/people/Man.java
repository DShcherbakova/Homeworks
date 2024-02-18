package l18.people;

import java.util.Scanner;

public class Man {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у мужчин?");
        System.out.println("(Подсказка - 46)");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Man " + this.name + ", " + "возраст - " + age + ", " + "хромосом - " + chromosomNumber;
    }
}
