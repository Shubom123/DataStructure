package com.parentheses;

public class Node {

    String element;
    Node next;
    public Node(String element) {
        this.element = element;
        this.next = null;
        BalancedParantheses.size++;
    }

}