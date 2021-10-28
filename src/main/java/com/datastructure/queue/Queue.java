package com.datastructure.queue;

public interface Queue<T> {
  void offer(T element);

  T poll();

  T peek();

  int size();

  boolean isEmpty();
}