package l24.transport;

public class Transport {
    private String model;
    private String color;
    private int age;

    public Transport(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }
    public boolean equals(Transport transport) {
        return age == transport.age && transport.equals(transport.model);
    }
    @Override
    public int hashCode() {
        return age + model.hashCode();
    }

    public String toString() {

        return model + ", " + this.color + ", " + age;
    }

    public void goStartOfMovement() {

        System. out.println("К сожалению бак пуст!\n" );
    }
}

