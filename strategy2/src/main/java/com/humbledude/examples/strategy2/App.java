package com.humbledude.examples.strategy2;


import com.humbledude.examples.strategy2.processor.FileProcessor;
import com.humbledude.examples.strategy2.processor.MemoryProcessor;
import com.humbledude.examples.strategy2.processor.Processor;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class App {


  public static void main(String[] args) {

    System.out.println("hello world");

    Processor processor1 = new FileProcessor();
    processor1.setInputData(null);
    processor1.doProcess();
    System.out.println("FileProcessor : " + processor1.getLastProcessTime() + "ms");

    Processor processor2 = new MemoryProcessor();
    processor2.setInputData(null);
    processor2.doProcess();
    System.out.println("MemoryProcessor : " + processor2.getLastProcessTime() + "ms");

  }
}
