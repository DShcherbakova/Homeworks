package l35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {

        List<Bobr> list = new ArrayList<>();
        list.add(new Bobr("Rupert", 9, 2));
        list.add(new Bobr("Maks", 8, 7));
        list.add(new Bobr("Miroslava", 7, 4));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (b1, b2) -> b1.name.compareTo(b2.name));
        System.out.println(list);

        list.sort((b1, b2) -> ((int) b1.relativesCount - b2.relativesCount));
        System.out.println(list);
    }
}
