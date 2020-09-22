package com.company;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println(myList);


        myList.add("dig");
        myList.add("yes");
        myList.add("32");
        myList.add("1244");
        myList.add("12322");
        myList.add(3,"832898323892");
        myList.add("12323232");
        myList.add(6,32232);
        myList.add("123223222");
        System.out.println(myList);
    }
}
