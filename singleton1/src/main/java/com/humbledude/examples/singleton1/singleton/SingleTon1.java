package com.humbledude.examples.singleton1.singleton;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class SingleTon1 extends SingleTon{

  private static SingleTon1 instance = null;

  private SingleTon1() {
  }

  public static SingleTon1 getInstance() {
    if (instance == null) {
      instance = new SingleTon1();
    }
    return instance;
  }

  public static void reset() {
    instance = null;
  }

  public static String getComment() { return "basic singleton"; }
}
