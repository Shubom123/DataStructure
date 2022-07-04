package com.orderedlist;

public class List {
    Node head;
    Node tail;
    public Node push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public void sort() {
        Node currentNode;
        Node nextNode;
        int temp;
        for (currentNode = head; currentNode.next != null; currentNode = currentNode.next) {
            for (nextNode = currentNode.next; nextNode != null; nextNode = nextNode.next) {
                if (currentNode.data > nextNode.data) {
                    temp = currentNode.data;
                    currentNode.data = nextNode.data;
                    nextNode.data = temp;
                }
            }
        }
    }
}
