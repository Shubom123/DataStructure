package com.orderedlist;

public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
    @Override
    public String toString(){
        return "Node { " +
                "data = " + data +
                ", next = " + next +
                " }";
    }
}
