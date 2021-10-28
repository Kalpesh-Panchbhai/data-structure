package com.datastructure;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    singlyLinkedList.add(1);
    singlyLinkedList.add(2);
    singlyLinkedList.add(3);
    singlyLinkedList.add(0,13);
    singlyLinkedList.removeFirst();

    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(0,13);
    linkedList.removeFirst();
  }
}
