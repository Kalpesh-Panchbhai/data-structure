package com.datastructure.arraylist;

import java.io.Serializable;

public class ArrayListImp<E> implements Serializable {

  private static final int DEFAULT_CAPACITY = 10;

  private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

  private Object[] elementData;

  private int size;

  private transient int modCount;

  public ArrayListImp(){
    elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
  }


}
