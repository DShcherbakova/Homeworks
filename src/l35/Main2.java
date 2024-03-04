package l35;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Rupert", 2);
        map.put("Maks", 7);
        map.put("Miroslava", 4);

        for (String key : map.keySet()) {
            System.out.println(key + ", relatives count: " +
                    map.get(key));
        }
    }

}
