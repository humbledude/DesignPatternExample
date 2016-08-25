package com.humbledude.examples.decorator1.guitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public class ElecGuitar implements Guitar {

  @Override
  public String playSound() {
    return "띵띵띵";
  }
}
