package com.humbledude.examples.abstractfactory.storage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class HDDStorage implements IStorage{
  @Override
  public String getName() {
    return "HDD";
  }

  @Override
  public int getPrice() {
    return 60_000;
  }

  @Override
  public int getSize() {
    return 1024;
  }

  @Override
  public int getIOScore() {
    return 3_000;
  }
}
