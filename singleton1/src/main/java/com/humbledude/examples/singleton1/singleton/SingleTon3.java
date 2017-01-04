package com.humbledude.examples.singleton1.singleton;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class SingleTon3 extends SingleTon {

  private static  SingleTon3 instance = null;

  private SingleTon3() {
  }

  public static SingleTon3 getInstance() {
    if (instance == null) {
      synchronized (SingleTon3.class) {
        if (instance == null) {

          instance = new SingleTon3();
        }
      }
    }
    return instance;
  }
  public static void reset() {
    instance = null;
  }

  public static String getComment() { return "double checked locking"; }
}
