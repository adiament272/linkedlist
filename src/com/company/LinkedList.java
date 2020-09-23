package com.company;

import org.w3c.dom.Node;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.ObjectStreamException;

public class LinkedList {
    Node node1;
    Node head;
    int count;


    public LinkedList() {

        head = null;
        node1 = null;

    }


    public boolean add(Object itemToAdd) {
        Node currentNode = head;
        Node newNode = new Node(itemToAdd);
        int counter = -1;
        if (head == null) {
            head = newNode;
            return true;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                counter++;
            }
            currentNode.next = newNode;
            return true;

        }
    }

    public void add(int count,Object itemToAdd) {
        Node currentNode = head;
        Node newNode = new Node(itemToAdd);
        int counter = 0;
        if (head == null) {
            head = newNode;

        } else {
            while (currentNode.next != null & counter < count-1) {
                counter++;
                currentNode = currentNode.next;
            }
            Node temp = new Node(itemToAdd);
            temp.next = currentNode.next;
            currentNode.next = temp;
        }
    }



    public void addFirst(Object itemToAdd) {
        Node AddFirst = new Node(itemToAdd);
        AddFirst.next = head;
        head = AddFirst;
}



    public void addLast(Object itemToAdd){
        Node currentNode = head;
    while (currentNode.next != null){
        currentNode = currentNode.next;
    }
        Node last = new Node(itemToAdd);
    currentNode.next = last;

    }



    public void clear(){
        Node newNode = new Node(0);
        head = newNode;
    }






    public boolean contains(Object item){
        Node temp1 = head;
        if(temp1 != null && temp1.data == item){
            head = temp1.next;
            return true;
        }
        while(temp1 != null && temp1.data != item){
            temp1 = temp1.next;

        }
        if (temp1 == null){
            return false;
        }
        return true;
    }


    public Object get(int index){
        Node currentNode = head;
        int counter = 0;
        while (currentNode.next != null & counter < index) {
            counter++;
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public Object getFirst(){
       Node temp = head;
       return temp.data;
    }

    public Object getLast(){
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }





    public int indexOf(Object item){
        Node temp1 = head;

        int counter = 0;
        if(temp1 != null && temp1.data == item){
            head = temp1.next;
        }
        while(temp1 != null && temp1.data != item){
            temp1 = temp1.next;
            counter++;

        }
        if (temp1 == null){
        }

        return counter;

    }

    public int lastIndexOf(Object item){
        Node temp1 = head;

        int counter = 0;
        if(temp1 != null && temp1.data == item){
            head = temp1.next;
        }
        while(temp1 != null && temp1.data != item){

            temp1 = temp1.next;
            counter++;

        }
        if (temp1 == null){
        }

        temp1.next = temp1.next;
        return counter;

    }

    public Object poll(){
        Node temp = head;
        head = temp.next;
        return temp.data;
    }

    public Object pollLast(){
    Node temp = head;
        while(temp.next.next.next != null){
        temp = temp.next;
    }
        Node temp2 = temp.next.next;
        temp.next.next = null;
        return temp2.data;
}



    public Object remove(int index){
        Node temp = head;
        int counter = 0;
        if(temp == null){
            return temp.data;
        }

        if (index <= 0){
            head = temp.next;
            return temp.data;
        }
        while(temp != null && counter < (index-1)){
            counter++;
            temp = temp.next;
        }
        if (temp.next == null){
            return temp.data;
        }
        Node temp2 = temp.next.next;
        temp.next = temp2;
        return temp2.data;

    }

    public Object remove(Object obj){
    Node toRemove = head;
    Node temp = null;

    if(toRemove != null && toRemove.data == obj){
        head = toRemove.next;
        return toRemove.data;
    }
        while(toRemove != null && toRemove.data != obj){
            temp = toRemove;
            toRemove = toRemove.next;

        }
    if (toRemove == null){
        return obj;
    }

    temp.next = toRemove.next;
    return toRemove.data;

    }


    public Object set(int index, Object item){
        Node currentNode = head;
        Node newNode = new Node(item);
        int counter = 0;
        if (head == null) {
            head = newNode;
            System.out.println("processing");

        } else {
            while (currentNode.next != null & counter < index-2) {
                counter++;
                currentNode = currentNode.next;
            }
            Node temp = new Node(item);
            temp.next = currentNode.next.next;
            currentNode.next = temp;
        }

        return currentNode.next.data;

    }







    public int size(){
        Node currentNode = head;
        int counter = 1;
        while(currentNode.next != null){
            counter++;
            currentNode = currentNode.next;
        }
        return counter;
    }


    public void display(){
        Node currentNode = head;
        if(head == null){

        }
        else if (currentNode.next != null) {
            while (currentNode.next != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
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
