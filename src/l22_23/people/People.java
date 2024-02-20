package l22_23.people;

public class People {
    protected String name;
    protected String gender;
    protected int age;

    public People(String name, String gender, int age){
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String toString() {

        return this.name + ", " + gender + ", " + age;
    }
    public void applySkill() {

        System. out.println("Я умею петь\n");
    }
}
