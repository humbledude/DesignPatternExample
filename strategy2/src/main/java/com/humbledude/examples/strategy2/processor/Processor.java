package com.humbledude.examples.strategy2.processor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public abstract class Processor {

  // assume data is in here
  private List<String> inputData;

  private long startTime;
  private long endTime;

  protected abstract void process();

  public void setInputData(List<String> inputData) {
    this.inputData = inputData;
  }

  public void doProcess() {
    startTime = System.currentTimeMillis();
    process();
    endTime = System.currentTimeMillis();
  }

  public long getLastProcessTime() {
    return endTime - startTime;
  }

}
