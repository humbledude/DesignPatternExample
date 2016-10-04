package com.humbledude.examples.factorymethod.cpu;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class AmdFx8350 implements IItem {
  String name = "FX-8350";
  String vendor = "AMD";
  int score = 8940;
  int price = 135_000;

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
