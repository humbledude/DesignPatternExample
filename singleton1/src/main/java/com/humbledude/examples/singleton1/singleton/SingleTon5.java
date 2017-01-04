package com.humbledude.examples.singleton1.singleton;

import java.io.Serializable;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public enum SingleTon5{
  INSTANCE;

  public static SingleTon5 getInstance() {
    return INSTANCE;
  }
  public static void reset() {
    // no way to release instance memory
    INSTANCE.count = 0;
  }

  public static String getComment() { return "enum initialization"; }

  // no way to extend a class : interface can be used
  private int count = 0;

  public synchronized void increase() {
    count++ ;
  }

  public int getCount() {
    return count;
  }
}
