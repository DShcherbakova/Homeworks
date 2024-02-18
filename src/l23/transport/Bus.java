package l23.transport;

public class Bus extends Transport {

    public Bus(String name, int age){

        super(name, "Blue", age);
    }

    public void goStartOfMovement() {

        System. out.println("Lotos начинает движение!\n" );
    }
}