package com.humbledude.examples.abstractfactory.memory;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class HynixMemory implements IMemory {
  @Override
  public String getName() {
    return "Hynix";
  }

  @Override
  public int getPrice() {
    return 18_000;
  }

  @Override
  public int getIOScore() {
    return 2_800;
  }
}
