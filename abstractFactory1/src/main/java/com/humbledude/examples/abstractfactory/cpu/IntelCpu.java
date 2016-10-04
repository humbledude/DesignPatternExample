package com.humbledude.examples.abstractfactory.cpu;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class IntelCpu implements ICpu {


  @Override
  public String getName() {
    return "Intel";
  }

  @Override
  public int getPrice() {
    return 250_000;
  }

  @Override
  public int getClockScore() {
    return 5_000;
  }
}
