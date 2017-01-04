package com.humbledude.examples.singleton1.singleton;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class SingleTon4 extends SingleTon {

  private SingleTon4() {
  }

  private static class Holder {
    private static final SingleTon4 instance = new SingleTon4();
  }

  public static SingleTon4 getInstance() {
    return Holder.instance;
  }
  public static void reset() {
    // no way to release instance memory
    Holder.instance.count = 0;
  }

  public static String getComment() { return "initialization on demand holder idiom"; }
}
