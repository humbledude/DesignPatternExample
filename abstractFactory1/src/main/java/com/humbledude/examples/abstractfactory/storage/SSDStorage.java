package com.humbledude.examples.abstractfactory.storage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class SSDStorage implements IStorage {
  @Override
  public String getName() {
    return "SSD";
  }

  @Override
  public int getPrice() {
    return 120_000;
  }

  @Override
  public int getSize() {
    return 512;
  }

  @Override
  public int getIOScore() {
    return 30_000;
  }
}
