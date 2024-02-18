package l24.animal;

public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public boolean equals(Animal animal) {

        return age == animal.age && name.equals(animal.name);
    }
    @Override
    public int hashCode() {

       return age + name.hashCode();
    }

    public String toString() {

        return this.name + ", " + color + ", " + age;
    }
    public void applySkill() {

            System.out.println("Я ничего не умею\n");
    }
}

