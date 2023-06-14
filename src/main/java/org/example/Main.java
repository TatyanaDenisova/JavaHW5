package org.example;

import java.util.HashMap;
import java.util.Map;



//Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся
//        имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.
public class Main {
    public static Map<String, String> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addToPhoneBook(phoneBook);

    }
    public static void addToPhoneBook(Map<String, String> phoneBook){
        addNote(phoneBook, "Ivanov", "3332211");
        addNote(phoneBook,"Ivanova", "0946329");
        addNote(phoneBook,"Petrov", "7892977");
        addNote(phoneBook,"Smirnov", "6721133");
        addNote(phoneBook,"Ivanov", "3313322");
        addNote(phoneBook,"Ivanov", "9012344");



        System.out.println(phoneBook);
    }
    public static void addNote(Map<String, String> note, String key, String value){
        if (note.containsKey(key)) {
            note.put(key, note.get(key) + ", " + value);
        } else {
            note.put(key, value);
        }
    }
}