package com.humbledude.examples.abstractfactory.cpu;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class AMDCpu implements ICpu {
  @Override
  public String getName() {
    return "AMD";
  }

  @Override
  public int getPrice() {
    return 125_000;
  }

  @Override
  public int getClockScore() {
    return 3_000;
  }
}
