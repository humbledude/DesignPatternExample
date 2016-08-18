package com.humbledude.examples.strategy2.processor;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MemoryProcess implements IProcess {

  StringBuilder builder = new StringBuilder();

  @Override
  public void process() {
    // 뻘짓 process 중
    for (int i = 0; i < 10000 ; i++ ) {
      builder.append("[" + i + "]");
    }
  }
}
