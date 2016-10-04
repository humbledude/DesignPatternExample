package com.humbledude.examples.factorymethod.cpu;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class CpuFactory {

  public IItem createCpu(String vendor) {
    if ("AMD".equals(vendor)) {
      return new AmdFx8350();
    } else if ("Intel".equals(vendor)) {
      return new IntelI56600();
    } else {
      return null;
    }
  }

}
