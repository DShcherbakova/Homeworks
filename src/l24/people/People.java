package l24.people;

import l24.animal.Animal;

public class People {
    public String name;
    public String gender;
    public int age;

    public People(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        People people = (People) obj;
        return age == people.age && (
                name == null ? people.name == null :
                        name.equals(people.name)
        );
    }
    @Override
    public int hashCode() {

        return age + name.hashCode();
    }

    public String toString() {

        return this.name + ", " + gender + ", " + age;
    }
    public void applySkill() {

        System. out.println("Я умею петь\n");
    }
}
