package l35;

import java.util.Comparator;

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

