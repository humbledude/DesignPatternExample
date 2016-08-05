package com.humbledude.examples.strategy2.processor;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MemoryProcessor extends Processor{

  StringBuilder builder = new StringBuilder();

  protected void process() {
    // 뻘짓 process 중
    for (int i = 0; i < 10000 ; i++ ) {
      builder.append("[" + i + "]");
    }
  }
}
