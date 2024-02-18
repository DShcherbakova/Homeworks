package l18.animal;

import java.util.Scanner;

public class Dog {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у собак?");
        System.out.println("(Подсказка - 78)");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Dog " + this.name + ", " + "возраст - " + age + ", " + "хромосом - " + chromosomNumber;
    }
}
