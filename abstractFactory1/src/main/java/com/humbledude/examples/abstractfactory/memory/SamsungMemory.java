package com.humbledude.examples.abstractfactory.memory;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class SamsungMemory implements IMemory{
  @Override
  public String getName() {
    return "Samsung";
  }

  @Override
  public int getPrice() {
    return 20_000;
  }

  @Override
  public int getIOScore() {
    return 3_000;
  }
}
