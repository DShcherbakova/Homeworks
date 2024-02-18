package l21;

import l21.transport.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class CarTest {
    private MyArrayList carShowroom;
    private Car bmw;
    private Car porsche;
    private Car lamborghini;
    private Car ford;
    private Car ferrari;

    @BeforeEach
    public void setUp() {
        this.bmw = new Car("Bmw", 2);
        this.porsche = new Car("Porsche", 2);
        this.lamborghini = new Car("Lamborghini", 2);
        this.ford = new Car("Ford", 2);
        this.ferrari = new Car("Ferrari", 2);

        this.carShowroom = new MyArrayList();

        carShowroom.add(bmw);
        carShowroom.add(porsche);
        carShowroom.add(lamborghini);
        carShowroom.add(ford);
        carShowroom.add(ferrari);
    }
    @Test
    public void testGetter() {
        MyArrayList carShowroomEmpty = new MyArrayList();
        Assertions.assertEquals(this.bmw, this.carShowroom.getByIndex(0));
        Assertions.assertEquals(ferrari, carShowroom.getByIndex(4));
    }
    @Test
    public void testCount() {
        MyArrayList carShowroomEmpty = new MyArrayList();
        Assertions.assertEquals(carShowroomEmpty.count, 0);
        Assertions.assertEquals(5, this.carShowroom.count);
    }
}