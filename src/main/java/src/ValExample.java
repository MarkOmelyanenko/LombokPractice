package src;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class ValExample {
    public static void example1() {
        val example = new ArrayList<String>();
        example.add("HELLO, WORLD!");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }

    public static void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
