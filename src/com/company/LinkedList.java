package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.ls.LSOutput;

public class LinkedList {
    Node node1;
    Node head;
    int count;


    public LinkedList(){

        head = null;
        node1 = null;

    }


    public boolean add(Object itemToAdd){
        Node currentNode = head;
        Node newNode = new Node(itemToAdd);
        int counter = -1;
        if(head == null) {
            head = newNode;
            System.out.println("processing");
            return true;
        }
        else{
            while(currentNode.next != null){
                currentNode = currentNode.next;
                System.out.println("Next node");
                counter++;
                System.out.println(counter);
            }
            currentNode.next = newNode;
            return true;

        }
    }
    public void add(int count,Object itemToAdd) {
        Node currentNode = head;
        Node newNode = new Node(itemToAdd);
        int counter = -1;
        if (head == null) {
            head = newNode;
            System.out.println("processing");

        } else {
            while (currentNode.next != null & counter <= count) {
                currentNode = currentNode.next;
                System.out.println("Next nodeind");
                counter++;
                System.out.println(counter);
            }
            Node temp = new Node(itemToAdd);
            currentNode.next = temp;
            currentNode = currentNode.next;
            System.out.println("Next nodeind2");
            System.out.println(counter);
        }
    }


    private class Node {


        Object data;
        Node next;
        Node previous;

        public Node(Object data){
            this.data = data;
            next = null;
        }


        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

    }




}
