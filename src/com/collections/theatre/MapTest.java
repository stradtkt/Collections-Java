package com.collections.theatre;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled language");
        languages.put("Python", "Interpreted OOP language");
        languages.put("JavaScript", "A scripting language");
        languages.put("C#", "A high level OOP language");

        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "This code is Java");
        }

        System.out.println("===========================================");
        if(languages.remove("JavaScript", "A scripting language.")) {
            System.out.println("JavaScript removed");
        } else {
            System.out.println("Key value pair not found");
        }
        System.out.println(languages.replace("JavaScript", "A complex scripting language"));
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
