package l21.animal;

import java.util.Scanner;

public class Cat {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у котов?");
        System.out.println("(Подсказка - 38)");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Cat " + this.name + ", " + "возраст - " + age + ", " + "хромосом - " + chromosomNumber;
    }
}
