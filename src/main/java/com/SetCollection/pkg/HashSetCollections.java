package com.SetCollection.pkg;

import com.Listcollections.pkg.ArrayListCollections;
import org.springframework.aop.target.LazyInitTargetSource;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetCollections {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Pen");
        set1.add("Book");
        set1.add("Ruler");
        set1.add("Pencil");

        Set<String> set2 = new HashSet<>();
        set2.add("Pen");
        set2.add("Book");
        set2.add("Pencil");
        set2.add("Eraser");

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
