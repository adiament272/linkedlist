package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.ls.LSOutput;

public class LinkedList {
    Node node1;
    Node head;



    public LinkedList(){

        head = null;
        node1 = null;

    }


    public void add(Object itemToAdd){
        if(head == null) {
            Node newNode = new Node(itemToAdd);
            head = newNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                System.out.println("Next node");
            }
        }
    }

    private class Node {


        Object data;
        Node next;
        Node previous;

        public Node(Object data){
            this.data = data;
            next = null;
            System.out.println("Hi");
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

    public boolean add(Object item){
            node1.setNext(new Node(item));

    }

    }




}
