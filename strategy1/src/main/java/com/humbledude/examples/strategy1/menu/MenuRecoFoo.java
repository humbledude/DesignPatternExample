package com.humbledude.examples.strategy1.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MenuRecoFoo implements MenuRecoAlgorithm{

  private List<String> menu;

  public MenuRecoFoo() {
    menu = new ArrayList<>();
    menu.add("짜파게티");
    menu.add("스파게티");
    menu.add("샌드위치");
  }
  @Override
  public String getRecoMenu() {
    return menu.get((int)(Math.random() * 10) % 3);
  }
}
