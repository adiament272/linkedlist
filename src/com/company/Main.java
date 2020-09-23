package com.company;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        System.out.println(myList);

        // INITIAL LIST with 10 obj

        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
        myList.add("g");
        myList.add("h");
        myList.add("i");
        myList.add("j");
        System.out.println("------------INITIAL---------");
        myList.display();
        System.out.println("---------MODS------------");
        // MODIFICATIONS
        myList.set(6,"N");
        myList.add(3,"k");
        myList.addFirst("L");
        myList.addLast("M");
        myList.display();
        System.out.println("-----------POLLING----------");

        // polling and removing
        myList.remove(3);
        myList.remove("c");
        myList.poll();
        myList.pollLast();
        myList.display();
        System.out.println("-----------RETRIEVE----------");

        // retrieving info i.e. "the getters"
        System.out.println(myList.get(3));
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
        System.out.println(myList.indexOf("e"));
        System.out.println(myList.lastIndexOf("k"));
        System.out.println(myList.contains("c"));
        System.out.println(myList.contains("i"));
        System.out.println(myList.size());


        // clear
        myList.clear();







    }
}
