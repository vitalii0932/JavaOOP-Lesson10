package Exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);

        Map<Integer, Integer> stat = new HashMap<>();

        for (Integer number : list) {
            if(stat.containsKey(number)) {
                stat.put(number, stat.get(number) + 1);
            } else {
                stat.put(number, 1);
            }
        }

        Set<Integer> setKeys = stat.keySet();

        for (var value : setKeys) {
            System.out.println("\"" + value + "\" -> " + stat.get(value));
        }
    }
}
