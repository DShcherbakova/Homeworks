package l24.transport;

import l24.people.People;

public class Transport {
    public String model;
    public String color;
    public int age;

    public Transport(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Transport transport = (Transport) obj;
        return age == transport.age && (
                model == null ? transport.model == null :
                        model.equals(transport.model)
        );
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

