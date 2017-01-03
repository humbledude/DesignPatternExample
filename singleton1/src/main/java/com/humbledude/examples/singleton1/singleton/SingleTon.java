package com.humbledude.examples.singleton1.singleton;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class SingleTon {

  public int count = 0;

  public synchronized void increase() {
    count ++ ;
  }

  public int getCount() {
    return count;
  }

  public static String getComment() { return "singleton"; }
}
