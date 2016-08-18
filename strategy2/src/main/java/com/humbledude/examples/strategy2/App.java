package com.humbledude.examples.strategy2;


import com.humbledude.examples.strategy2.processor.FileProcess;
import com.humbledude.examples.strategy2.processor.MemoryProcess;
import com.humbledude.examples.strategy2.processor.Processor;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class App {


  public static void main(String[] args) {

    System.out.println("hello world");

    Processor processor = new Processor();
    processor.setInputData(null);

    processor.setProcess(new FileProcess());
    processor.doProcess();
    System.out.println("FileProcess : " + processor.getLastProcessTime() + "ms");

    processor.setProcess(new MemoryProcess());
    processor.doProcess();
    System.out.println("MemoryProcess : " + processor.getLastProcessTime() + "ms");

  }
}
