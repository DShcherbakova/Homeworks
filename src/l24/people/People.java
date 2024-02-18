package l24.people;

public class People {
    private String name;
    private String gender;
    private int age;

    public People(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    public boolean equals(People people) {
        return age == people.age && name.equals(people.name);
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
