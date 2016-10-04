package com.humbledude.examples.factorymethod;

import com.humbledude.examples.factorymethod.cpu.CpuFactory;
import com.humbledude.examples.factorymethod.cpu.IItem;

/**
 * Created by keunhui.park on 2016. 9. 22..
 */
public class App {

  public static void main (String args[]) {
    System.out.println("Hello world!");

    CpuFactory cpuFactory = new CpuFactory();
    System.out.println("인텔 씨피유 하나 주세요.");
    IItem intelCpu =  cpuFactory.createCpu("Intel");
    System.out.println("옛다: " + intelCpu.getName());

    System.out.println("AMD 씨피유 하나 주세요.");
    IItem amdCpu =  cpuFactory.createCpu("AMD");
    System.out.println("옛다: " + amdCpu.getName());

    System.out.println("가성비 비교해주세요. 스코어 / 가격으루");
    System.out.println("인텔 : " + (double)intelCpu.getScore()/intelCpu.getPrice());
    System.out.println("AMD : " + (double)amdCpu.getScore()/amdCpu.getPrice());


  }
}
