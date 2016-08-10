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

    Processor processor = new Processor();
    processor.setInputData(null);

    processor.setProcess(new FileProcessor());
    processor.doProcess();
    System.out.println("FileProcessor : " + processor.getLastProcessTime() + "ms");

    processor.setProcess(new MemoryProcessor());
    processor.doProcess();
    System.out.println("MemoryProcessor : " + processor.getLastProcessTime() + "ms");

  }
}
