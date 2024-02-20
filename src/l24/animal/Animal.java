package l24.animal;

public class Animal {
    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Animal animal = (Animal) obj;
        return age == animal.age && (
                name == null ? animal.name == null :
                        name.equals(animal.name)
        );
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

