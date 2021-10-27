package com.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListCaller {
  public static void main(String[] args) {
    LinkedListImp<Integer> linkedListImp = new LinkedListImp<>();
    linkedListImp.addFirst(1);
    linkedListImp.addFirst(2);
    linkedListImp.addFirst(3);
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(0, 1);
    linkedList.add(0, 2);
  }
}
