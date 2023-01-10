package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Toy> toyMap = new HashMap<>();
        addMap(toyMap);
        System.out.println("Используем keySet():");
        Toy.printByKeySet(toyMap);
        System.out.println("Используем values():");
        Toy.printByValues(toyMap);
        System.out.println("Используем entrySet():");
        Toy.printByEntrySet(toyMap);
    }
    public static void addMap(Map<String, Toy> toyMap) {
        toyMap.put("Кукла", new Toy("Кукла", 1000));
        toyMap.put("Машинка", new Toy("Машинка", 1500));
        toyMap.put("Домик", new Toy("Домик", 3500));
        toyMap.put("Книга", new Toy("Книга", 500));
        toyMap.put("Бетмэн", new Toy("Бетмэн", 800));
    }
}
