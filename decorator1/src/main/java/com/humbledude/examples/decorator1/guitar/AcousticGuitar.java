package com.humbledude.examples.decorator1.guitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public class AcousticGuitar implements Guitar{

  @Override
  public String playSound() {
    return "비바람이 치는 바다~";
  }
}
