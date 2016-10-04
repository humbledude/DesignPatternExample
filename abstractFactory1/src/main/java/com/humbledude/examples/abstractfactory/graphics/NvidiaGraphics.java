package com.humbledude.examples.abstractfactory.graphics;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class NvidiaGraphics implements IGraphics {

  @Override
  public String getName() {
    return "nVidia";
  }

  @Override
  public int getPrice() {
    return 300_000;
  }

  @Override
  public int getScore() {
    return 12_000;
  }
}
