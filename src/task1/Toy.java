package task1;

import java.util.Map;
import java.util.Set;

public class Toy {
    private String name;
    private int price;

    public Toy() {
    }

    public Toy(String name, int toyPrice) {
        this.name = name;
        this.price = toyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static <K, V> void printByKeySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
        System.out.println();
    }

    public static <K, V> void printByValues(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static <K, V> void printByEntrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return  "игрушка: '" + name + '\'' +
                ", цена: " + price + " сом";
    }
}
