package com.Listcollections.pkg;


import java.util.*;

public class ArrayListCollections {

    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Red");
        listOfString.add("Yellow");
        listOfString.add("Blue");
        listOfString.add("Green");
        listOfString.add("Orange");
        listOfString.add("Pink");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0, 45);
        nums.add(1, 15);
        nums.add(2, 2);


        System.out.println(nums);

        listOfString.remove(2);
        System.out.println(listOfString);

        Collections.sort(listOfString);
        System.out.println(listOfString);

        List<String> sub_List = listOfString.subList(1, 3);
        System.out.println(sub_List);

        System.out.println(listOfString.isEmpty());
        listOfString.clear();
        System.out.println(listOfString.isEmpty());

    }
}
