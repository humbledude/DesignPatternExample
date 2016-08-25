package com.humbledude.examples.decorator1.effector;

import com.humbledude.examples.decorator1.guitar.Guitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public class DelayEffector extends Effector{

  public DelayEffector(Guitar guitar) {
    super(guitar);
  }

  @Override
  public String playSound() {
    String originalSound =  super.playSound();
    return originalSound + originalSound;
  }
}
