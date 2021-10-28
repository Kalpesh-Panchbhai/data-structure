package com.datastructure;

public class Main {

  public static void main(String[] args) {
    SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.add(1);
    singlyLinkedList.add(2);
    singlyLinkedList.add(3);
    singlyLinkedList.add(4);
    System.out.println(singlyLinkedList.remove(3));
    singlyLinkedList.traverse();

  }
}
