package org.example;

//* Linked List/double linked list

import java.util.LinkedList;

public class LinkedLists {


    Node head;
    private static class Node {
        int item;
        Node next;
        Node prev;
        Node(int val) {
            item = val;
        }
    }




    public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<>();
            cars.add("Toyota");
            cars.add("Ford");
            cars.add("Honda");



        LinkedLists list = new LinkedLists();


        list = insertInto(list, 5);
        list = insertInto(list, 2);
        list = insertInto(list, 1);
        list = insertInto(list, 7);


        printList(list);


    }


    public static LinkedLists insertInto(LinkedLists list, int data) {

        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;

        }

        return list;

    }

    public static void printList(LinkedLists list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.item + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}
