package com.orderedlist;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to ordered linked list");
        List linkedList = new List();
        System.out.println("Enter the elements");
        Scanner scanner = new Scanner(System.in);
        int key1 = scanner.nextInt();
        int key2 = scanner.nextInt();
        int key3 = scanner.nextInt();
        int key4 = scanner.nextInt();
        int key5 = scanner.nextInt();
        linkedList.push(key1);
        linkedList.push(key2);
        linkedList.push(key3);
        linkedList.push(key4);
        linkedList.push(key5);
        System.out.println("Before sorting");
        linkedList.print();
        linkedList.sort();
        System.out.println("After sorting");
        linkedList.print();
    }
}
