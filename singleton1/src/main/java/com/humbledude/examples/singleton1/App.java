package com.humbledude.examples.singleton1;

import com.humbledude.examples.singleton1.singleton.SingleTon;
import com.humbledude.examples.singleton1.singleton.SingleTon1;
import com.humbledude.examples.singleton1.singleton.SingleTon2;
import com.humbledude.examples.singleton1.singleton.SingleTon3;
import com.humbledude.examples.singleton1.singleton.SingleTon4;
import com.humbledude.examples.singleton1.singleton.SingleTon5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 10. 13..
 */
public class App {


  public static void main(String[] args) throws Exception {
    System.out.println("Hello world!");

    final int max_thread = 100;
    final int max_testRepeat = 10000;
    final int max_testNum = 5;
    long start;

    for(int testNum = 1; testNum <= max_testNum; testNum++) {
      System.out.println("test" + testNum + " : " + getComment(testNum));


      start = System.currentTimeMillis();
      for (int i = 0; i < max_testRepeat; i++) {
        test(i, max_thread, testNum);
      }
      System.out.println("test" + testNum + " : done : " + (System.currentTimeMillis() - start) + "ms \n");
    }

  }

  private static void test (int index, final int max_thread, int type) throws Exception {
    List<Thread> threadList = new ArrayList<>();
    for (int i = 0; i < max_thread; i++) {
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          if (type != 5) {
            getSingleTon(type).increase();
          } else {
            SingleTon5.getInstance().increase();
          }
        }
      });
      threadList.add(thread);
      thread.start();
    }

    for (int i = 0; i < max_thread; i++) {
      threadList.get(i).join();
    }
    if (type != 5) {
      if (max_thread != getSingleTon(type).getCount()) {
        System.out.println("[" + index + "] expected : " + max_thread + " value : " + getSingleTon(type).getCount() );
      }
    } else {
      if (max_thread != SingleTon5.getInstance().getCount()) {
        System.out.println("[" + index + "] expected : " + max_thread + " value : " + SingleTon5.getInstance().getCount() );
      }
    }
    resetSingleTon(type);
  }

  private static SingleTon getSingleTon(int type) {
    switch (type) {
      case 1:
        return SingleTon1.getInstance();
      case 2:
        return SingleTon2.getInstance();
      case 3:
        return SingleTon3.getInstance();
      case 4:
        return SingleTon4.getInstance();
      default:
        return SingleTon1.getInstance();
    }
  }

  private static void resetSingleTon(int type) {
    switch (type) {
      case 1:
        SingleTon1.reset();
        break;
      case 2:
        SingleTon2.reset();
        break;
      case 3:
        SingleTon3.reset();
        break;
      case 4:
        SingleTon4.reset();
        break;
      case 5:
        SingleTon5.reset();
        break;
      default:
        SingleTon1.getInstance();
        break;
    }

  }

  private static String getComment(int type) {
    switch (type) {
      case 1:
        return SingleTon1.getComment();
      case 2:
        return SingleTon2.getComment();
      case 3:
        return SingleTon3.getComment();
      case 4:
        return SingleTon4.getComment();
      case 5:
        return SingleTon5.getComment();
      default:
        return SingleTon.getComment();
    }
  }
}
