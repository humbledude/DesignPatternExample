package com.humbledude.examples.singleton1.singleton;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class SingleTon2 extends SingleTon {

  private static SingleTon2 instance = null;

  private SingleTon2() {
  }

  public static synchronized SingleTon2 getInstance() {
    if (instance == null) {
      instance = new SingleTon2();
    }
    return instance;
  }

  public static void reset() {
    instance = null;
  }

  public static String getComment() { return "synchronized on getInstance"; }
}
