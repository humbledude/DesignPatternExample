package com.humbledude.examples.strategy2.processor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class Processor {

  // assume data is in here
  private List<String> inputData;

  private long startTime;
  private long endTime;

  private IProcess process;


  public void setInputData(List<String> inputData) {
    this.inputData = inputData;
  }

  public void doProcess() {
    startTime = System.currentTimeMillis();
    process.process();
    endTime = System.currentTimeMillis();
  }

  public long getLastProcessTime() {
    return endTime - startTime;
  }

  public IProcess getProcess() {
    return process;
  }

  public void setProcess(IProcess process) {
    this.process = process;
  }
}
