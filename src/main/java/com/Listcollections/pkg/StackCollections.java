package com.Listcollections.pkg;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackCollections {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Red");
        stack.add("Yellow");
        stack.add("Green");
        stack.add("Orange");
        stack.add("Pink");

        System.out.println(stack);

        stack.push("Black");

        System.out.println(stack.peek());

        System.out.println(stack.search("Pink"));





    }
}
