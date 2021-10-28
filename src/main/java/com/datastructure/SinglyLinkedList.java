package com.datastructure;

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
  }

  private void linkFirst(E e) {
  }


  private void linkAtPosition(int position, E e) {
  }

  private E unlinkFirst() {
    return null;
  }

  @Override
  public void addFirst(E e) {
    linkFirst(e);
  }

  @Override
  public void addLast(E e) {
    linkLast(e);
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

  @Override
  public boolean offerFirst(E e) {
    linkFirst(e);
    return true;
  }

  @Override
  public boolean offerLast(E e) {
    linkLast(e);
    return true;
  }

  @Override
  public E removeFirst() {
    return unlinkFirst();
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
