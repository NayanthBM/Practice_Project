package com.SetCollection.pkg;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        set1.add("Red");
        set1.add("Pen");
        set1.add("Book");
        set1.add("Ruler");
        set1.add("Pencil");

        Iterator<String> iterator = set1.iterator();

        while (iterator.hasNext()) {
            String colours = iterator.next();

            System.out.println(colours);
        }

        TreeSet<String> t_set1 = new TreeSet<String>();
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("Free Tree set: "+t_set1);

        TreeSet<String> t_set2 = new TreeSet<String>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: "+t_set2);
        for (String element : t_set1) {
            System.out.println(t_set2.contains(element) ? "Yes" : "No");
        }

    }
}
