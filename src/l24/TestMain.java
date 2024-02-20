package l24;

import l24.animal.Animal;

import l24.animal.Cow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestMain {
    private Animal cat;
    private Animal cow;
    private Animal dog;

    @BeforeEach
    public void setUp(){
        this.cat = new Animal("Murka", "White", 2);
        this.cow = new Animal("Murka", "White", 2);
        this.dog = new Animal("Murka", "White", 2);



    }
    @Test
    public void testEquality(){
        Assertions.assertTrue(cat.equals(cat));
    }
    @Test
    public void testСomparison(){
        Assertions.assertTrue(cat.equals(cow));
        Assertions.assertTrue(cow.equals(dog));
        Assertions.assertTrue(dog.equals(cat));
    }
}

