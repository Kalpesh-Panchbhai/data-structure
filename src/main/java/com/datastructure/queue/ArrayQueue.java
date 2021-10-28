package com.datastructure.queue;

public class ArrayQueue<T> implements Queue<T> {

  private final int front = 0;
  private final int rear = 0;
  private Object[] data;

  @Override
  public void offer(T element) {
  }

  @Override
  public T poll() {
    return null;
  }

  @Override
  public T peek() {
    return null;
  }

  @Override
  public int size() {
    return front - rear;
  }

  @Override
  public boolean isEmpty() {
    return rear == front;
  }
}
