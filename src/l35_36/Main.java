package l35_36;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        List<Bobr> list = new ArrayList<>();
        list.add(new Bobr("Rupert", 9, 2));
        list.add(new Bobr("Maks", 8, 7));
        list.add(new Bobr("Miroslava", 7, 4));

        System.out.println(list);

        /*Collections.sort(list);
        System.out.println(list);

        list.sort(new NameComparator());
        System.out.println(list);

        list.sort(new RelativesCountComparator());
        System.out.println(list);

        Collections.sort(list, (b1, b2) -> b1.name.compareTo(b2.name));
        System.out.println(list);

         */

        Map<String, Integer> map = new HashMap<>();
        map.put("Rupert", 2);
        map.put("Maks", 7);
        map.put("Miroslava", 4);

        for (Bobr bobr: list) {
            map.put(bobr.name, bobr.relativesCount);
        }
        System.out.println(map.containsKey("Rupert") + ", " + map.containsValue(2) + ", " + map.keySet());
        System.out.println(map.containsKey("Maks") + ", " + map.containsValue(7) + ", " + map.keySet());
        System.out.println(map.containsKey("Miroslava") + ", " + map.containsValue(4) + ", " + map.keySet());

        Set<String> bobrs = new HashSet<>();

        bobrs.add("Rupert");
        bobrs.add("Maks");
        bobrs.add("Miroslava");

        for (Bobr bobr: list){
            map.put(bobr.name, bobr.relativesCount);
        }
        System.out.println(bobrs);

    }

}
