package l24.animal;

public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, "Orange", age);
    }
    public void applySkill() {

        goStartOfMovement();
    }

    public void goStartOfMovement() {

        System. out.println("Я умею громко лаять\n" );
    }
}
