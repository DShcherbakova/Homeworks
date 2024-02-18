package l19.transport;

public class Car {
    String name;
    int machineQualityGuarantee;
    public Car(String name, int machineQualityGuarantee){
        this.name = name;
        this.machineQualityGuarantee = machineQualityGuarantee;
    }

    public String toString() {
        return "Car - " + this.name + " (" + machineQualityGuarantee + ")";
    }
}

