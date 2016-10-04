package com.humbledude.examples.abstractfactory;

import com.humbledude.examples.abstractfactory.factory.HighEndPcFactory;
import com.humbledude.examples.abstractfactory.factory.IPcFactory;
import com.humbledude.examples.abstractfactory.factory.LowCostPcFactory;
import com.humbledude.examples.abstractfactory.pc.PC;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class App {

  public static void main(String args[]) {
    System.out.println("Hello world!!");

    System.out.println("아저씨 피씨 하나 싸게 맞춰줘요");
    IPcFactory pcFactory = new LowCostPcFactory();

    PC pc= pcFactory.createPC();

    System.out.println("옛다 : " + pc.getBom());
    System.out.println(pc.getPrice() + "원이야");
    System.out.println("성능은 " + pc.getPerformance());


    System.out.println("넘 구리다 좋은걸로 맞춰줘요");
    pcFactory = new HighEndPcFactory();

    pc = pcFactory.createPC();
    System.out.println("옛다 : " + pc.getBom());
    System.out.println(pc.getPrice() + "원이야");
    System.out.println("성능은 " + pc.getPerformance());

  }

}
