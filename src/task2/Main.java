package task2;

import java.util.*;

public class Main {
    static <E> List<E> noDuplicate(E[] array) {
        List<E> list = new ArrayList<>();
        Map<E, E> map = new HashMap<>();
        for (E arr : array) {
            map.put(arr, arr);
        }
        Set<Map.Entry<E, E>> set = map.entrySet();
        for (Map.Entry<E, E> st : set) {
            list.add(st.getKey());
        }
        return list;
    }

    static List<String> noDuplicate(String value) {
        String text = value;
        text = text.replace(" ", "");
        String[] arrayString = text.split(",");

        return Main.<String>noDuplicate(arrayString);
    }

    public static void main(String[] args) {
        System.out.println("Формат чисел : 1,2,3,3,4... и т.д");
        System.out.print("Введите набор чисел : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> listString = Main.<String>noDuplicate(text);

        System.out.println(text);
        System.out.println(Arrays.toString(listString.toArray()));
    }


}
