package com.Listcollections.pkg;


import java.util.*;

public class LinkedListCollection {

    public static void main(String[] args) {
        String element = "Black";
        List<String> colours = new LinkedList<>();

        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Orange");
        colours.add("Pink");

        System.out.println(colours);

        colours.add(element);

//        Collections.sort(colours);

        System.out.println(colours);

//        for (String color: colours) {
//            System.out.println(color);
//        }



        Iterator iterator = colours.listIterator(3);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if(colours.contains("Black") && colours.contains("Navy Blue")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}



