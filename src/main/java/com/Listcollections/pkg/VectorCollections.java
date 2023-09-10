package com.Listcollections.pkg;

import java.util.List;
import java.util.Vector;

public class VectorCollections {

    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("String");
        vector.add("Alice");
        vector.add("Bob");

        vector.set(0, "Merry");

        for (String element: vector
             ) {
            System.out.println(element);
        }
    }
}
