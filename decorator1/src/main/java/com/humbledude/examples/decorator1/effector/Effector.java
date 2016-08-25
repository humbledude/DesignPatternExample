package com.humbledude.examples.decorator1.effector;

import com.humbledude.examples.decorator1.guitar.Guitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public abstract class Effector implements Guitar {

  protected Guitar guitar;

  public Effector(Guitar guitar) {
    this.guitar = guitar;
  }

  public String playSound() {
    return this.guitar.playSound();
  }

}
