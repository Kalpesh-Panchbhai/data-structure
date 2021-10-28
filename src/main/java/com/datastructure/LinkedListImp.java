package com.datastructure;

import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImp<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

  transient int size = 0;

  transient Node<E> first;

  transient Node<E> last;

  public LinkedListImp() {
  }

  void linkLast(E e) {
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;
    if (l == null) {
      first = newNode;
    } else {
      l.next = newNode;
    }
    size++;
    modCount++;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public void addFirst(E e) {

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
    for (Node<E> x = first; x != null; x = x.next) {
      result[i++] = x.item;
    }
    return result;
  }

  private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
      this.item = element;
      this.next = next;
      this.prev = prev;
    }
  }

}
