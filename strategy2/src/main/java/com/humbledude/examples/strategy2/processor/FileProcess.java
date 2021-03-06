package com.humbledude.examples.strategy2.processor;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class FileProcess implements IProcess {

  @Override
  public void process() {
    File file = new File("./output");
    FileOutputStream stream;
    try {
      stream = new FileOutputStream(file);
      // 뻘짓 process 중
      for (int i = 0; i < 10000; i++) {
        String buffer = "[" + i + "]";
        stream.write(buffer.getBytes());
      }
      stream.close();
    } catch (Exception e) {
    }
  }
}
