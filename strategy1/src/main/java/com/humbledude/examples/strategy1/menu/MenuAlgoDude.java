package com.humbledude.examples.strategy1.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MenuAlgoDude implements MenuAlgorithm {

  private List<String> menu;

  public MenuAlgoDude() {
    menu = new ArrayList<>();
    menu.add("벌거킹");
    menu.add("맥더날드");
    menu.add("놋대리아");
  }
  @Override
  public String getRecoMenu() {
    return menu.get((int)(Math.random() * 10) % 3);
  }
}
