package Them3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        wordList();

        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Vodkin","83252364","Vodkin-1@mail.ru");
        phonebook.add("Morozov","84345464","Morozov-1@mail.ru");
        phonebook.add("Galanin","83254734","Galanin-1@mail.ru");
        phonebook.add("Lissov","832335464","Lissov@mail.ru");
        phonebook.add("Galanin","83236664","Galanin-2@mail.ru");
        phonebook.add("Vodkin","832354546","Vodkin-2@mail.ru");
        phonebook.add("Morozov","832535674","Morozov-2@mail.ru");

        System.out.println("e-mail Vodkin: " + phonebook.getMail("Vodkin"));
        System.out.println("e-mail Petrov: " + phonebook.getMail("Petrov"));
        System.out.println("phone Morozov: " + phonebook.getPhone("Morozov"));
        System.out.println("phone Lissov: " + phonebook.getPhone("Lissov"));

    }

    public static void wordList() {
        String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "java", "hate", "kent", "java", "coffee", "dog", "beta", "cat", "java" , "coffee",  "hate"};
        HashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);

        System.out.println(map);
        System.out.println("");

    }
}