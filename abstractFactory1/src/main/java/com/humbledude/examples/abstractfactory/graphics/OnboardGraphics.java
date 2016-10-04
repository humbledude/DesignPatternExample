package com.humbledude.examples.abstractfactory.graphics;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class OnboardGraphics implements IGraphics{
  @Override
  public String getName() {
    return "onboard";
  }

  @Override
  public int getPrice() {
    return 0;
  }

  @Override
  public int getScore() {
    return 1_000;
  }
}
