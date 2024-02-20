package l22_23.transport;

public class Transport {
    protected String model;
    protected String color;
    protected int age;

    public Transport(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String toString() {

        return model + ", " + this.color + ", " + age;
    }

    public void goStartOfMovement() {

        System. out.println("К сожалению бак пуст!\n" );
    }
}

