package com.datastructure;

import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> extends AbstractSequentialList<E> {

  transient int size = 0;

  transient Node<E> head;

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  private void linkLast(E e) {
    Node<E> newNode = new Node<>(e, null);
    if (head == null) {
      head = newNode;
    } else {
      Node<E> h = head;
      while (h.next != null) {
        h = h.next;
      }
      h.next = newNode;
    }
    size++;
    modCount++;
  }

  private void linkFirst(E e) {
    Node<E> newNode = new Node<>(e, head);
    head = newNode;
    size++;
    modCount++;
  }


  private void linkAtPosition(int position, E e) {
    if (position == 0) {
      linkFirst(e);
    } else {
      Node<E> newNode = new Node<>(e, null);
      Node<E> h = head;
      for (int i = 1; i < position; i++) {
        h = h.next;
      }
      newNode.next = h.next;
      h.next = newNode;
      size++;
      modCount++;
    }
  }

  private E unlinkFirst() {
    if (head == null) {
      throw new NoSuchElementException();
    }
    Node<E> h = head;
    head = head.next;
    h.next = null;
    size--;
    modCount++;
    return h.item;
  }

  private E unlinkLast() {
    Node<E> h = head;
    E item = null;
    if (h == null) {
      throw new NoSuchElementException();
    }
    if (head.next == null) {
      item = head.item;
      head = null;
    } else {
      while (h.next.next != null) {
        h = h.next;
      }
      item = h.next.item;
      h.next = null;
    }
    size--;
    modCount++;
    return item;
  }

  public void addFirst(E e) {
    linkFirst(e);
  }

  public void addLast(E e) {
    linkLast(e);
  }

  public boolean add(E e) {
    linkLast(e);
    return true;
  }

  public void add(int index, E e) {
    checkPositionIndex(index);

    if (index == size) {
      addLast(e);
    } else {
      linkAtPosition(index, e);
    }
  }

  private void checkPositionIndex(int index) {
    if (!(index >= 0 && index <= size)) {
      throw new IndexOutOfBoundsException();
    }
  }

  public E removeFirst() {
    return unlinkFirst();
  }

  public E removeLast() {
    return unlinkLast();
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Object[] toArray() {
    Object[] result = new Object[size];
    int i = 0;
    for (Node<E> x = head; x != null; x = x.next) {
      result[i++] = x.item;
    }
    return result;
  }

  public void traverse() {
    Node<E> h = head;
    while (h != null) {
      System.out.println(h.item);
      h = h.next;
    }
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
