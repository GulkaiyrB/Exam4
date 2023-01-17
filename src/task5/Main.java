package task5;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();


        set.add(new Student("Maks"));
        set.add(new Student("Misha"));
        set.add(new Student("Masha"));
        set.add(new Student("Alena"));
        set.add(new Student("Yulia"));


        System.out.println("Сортировка по алфавиту : " + set);

    }
}
