package com.datastructure.linkedlist;

import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList<E> extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

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
      size++;
      return;
    }
    Node<E> h = head;
    while (h.next != null) {
      h = h.next;
    }
    h.next = newNode;
    size++;
    modCount++;
  }

  private void linkFirst(E e) {
    Node<E> newNode = new Node<>(e, null);
    newNode.next = head;
    head = newNode;
    size++;
    modCount++;
  }

  @Override
  public void addFirst(E e) {
    linkFirst(e);
  }

  @Override
  public void addLast(E e) {
    linkLast(e);
  }

  @Override
  public boolean offerFirst(E e) {
    return false;
  }

  @Override
  public boolean offerLast(E e) {
    return false;
  }

  @Override
  public E removeFirst() {
    return null;
  }

  @Override
  public E removeLast() {
    return null;
  }

  @Override
  public E pollFirst() {
    return null;
  }

  @Override
  public E pollLast() {
    return null;
  }

  @Override
  public E getFirst() {
    return null;
  }

  @Override
  public E getLast() {
    return null;
  }

  @Override
  public E peekFirst() {
    return null;
  }

  @Override
  public E peekLast() {
    return null;
  }

  @Override
  public boolean removeFirstOccurrence(Object o) {
    return false;
  }

  @Override
  public boolean removeLastOccurrence(Object o) {
    return false;
  }

  @Override
  public boolean offer(E e) {
    return false;
  }

  @Override
  public E remove() {
    return null;
  }

  @Override
  public E poll() {
    return null;
  }

  @Override
  public E element() {
    return null;
  }

  @Override
  public E peek() {
    return null;
  }

  @Override
  public void push(E e) {
    addLast(e);
  }

  @Override
  public E pop() {
    return null;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<E> descendingIterator() {
    return null;
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

  private static class Node<E> {
    E item;
    Node<E> next;

    public Node(E item, Node<E> next) {
      this.item = item;
      this.next = next;
    }
  }
}
