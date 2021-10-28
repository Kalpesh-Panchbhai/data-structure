package com.datastructure.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class ArrayStack<E> implements Iterable<E>, Stack<E> {

  private Object[] data;
  private int capacity;
  private int top = -1;

  public ArrayStack() {
    capacity = 10;
    data = new Object[capacity];
  }

  @Override
  public E push(E item) {
    if (size() == capacity) {
      increaseCapacity();
    }
    data[++top] = item;
    return item;
  }

  private void increaseCapacity() {
    capacity = capacity + (capacity >>> 1);
    data = Arrays.copyOf(data, capacity);
  }

  @Override
  public E pop() {
    if (top == -1) {
      throw new EmptyStackException();
    }
    E value = (E) data[top];
    data[top--] = null;
    return value;
  }

  @Override
  public E peek() {
    if (top == -1) {
      throw new EmptyStackException();
    }
    return (E) data[top];
  }

  @Override
  public boolean isEmpty() {
    return top == -1;
  }

  @Override
  public int size() {
    return top + 1;
  }

  @Override
  public Iterator<E> iterator() {
    return (Iterator<E>) Arrays.stream(data).iterator();
  }

  @Override
  public void forEach(Consumer<? super E> action) {
    Iterable.super.forEach(action);
  }
}
