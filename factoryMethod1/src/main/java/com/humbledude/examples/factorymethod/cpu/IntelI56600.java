package com.humbledude.examples.factorymethod.cpu;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class IntelI56600 implements IItem {
  String name = "i5-6600";
  String vendor = "Intel";
  int score = 7767;
  int price = 230_000;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getVendor() {
    return vendor;
  }

  @Override
  public int getScore() {
    return score;
  }

  @Override
  public int getPrice() {
    return price;
  }
}
