package l35;

import l24.animal.Animal;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bobr implements Comparable<Bobr>{
    String name;
    int age;
    int relativesCount;

    Bobr(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    @Override
    public int compareTo(Bobr anotherBobr) {

        return this.age - anotherBobr.age;
    }
    @Override
    public String toString(){

        return name + ", " + "age: " + age + ", " + "relatives count: " + relativesCount + " *** ";
    }

    @Override
    public boolean equals(Object b) {
        if (this == b)
            return true;
        if (b == null || getClass() != b.getClass())
            return false;
        Bobr bobr = (Bobr) b;
        return age == bobr.age && (name == null ? bobr.name == null : name.equals(bobr.name));
    }
    @Override
    public int hashCode() {

        return age + name.hashCode();
    }

}

class NameComparator  implements Comparator<Bobr> {
    @Override
    public int compare(Bobr b1, Bobr b2){

        return b1.name.compareTo(b2.name);
    }
}
class RelativesCountComparator  implements Comparator<Bobr> {
    @Override
    public int compare(Bobr b1, Bobr b2) {

        return b1.compareTo(b2);
    }
}

