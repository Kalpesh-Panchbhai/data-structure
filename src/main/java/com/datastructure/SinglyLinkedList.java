package com.datastructure;

public class SinglyLinkedList<E> {

  transient int size = 0;

  transient Node<E> head;

  public Object[] toArray() {
    Object[] result = new Object[size];
    int i = 0;
    for (Node<E> x = head; x != null; x = x.next) {
      result[i++] = x.item;
    }
    return result;
  }

  private static class Node<E> {
    E item;
    Node<E> next;

    public Node(E item, Node<E> next) {
      this.item = item;
      this.next = next;
    }
  }
}
