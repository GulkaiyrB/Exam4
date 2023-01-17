package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Pet cat1 =  new Cat("Рыжик");
        Pet cat2 =  new Cat("Муся");
        Pet dog1 =  new Dog("Тикания");
        Pet dog2 =  new Dog("Барсик");
        Pet parrot1 =  new Parrot("Гоша");
        Pet parrot2 =  new Parrot("Вася");

        pets.put("Кот1", cat1);
        pets.put("Кот2", cat2);
        pets.put("Собака1", dog1);
        pets.put("Собака2", dog2);
        pets.put("Попугай1", parrot1);
        pets.put("Попугай2", parrot2);
        System.out.println(pets);

        Set<String> keys = pets.keySet();
        System.out.println("Ключи: " + keys);


    }
}
