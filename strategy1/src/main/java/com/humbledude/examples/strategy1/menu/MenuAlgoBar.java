package com.humbledude.examples.strategy1.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MenuAlgoBar implements MenuAlgorithm {

  private List<String> menu;

  public MenuAlgoBar() {
    menu = new ArrayList<>();
    menu.add("냉면육수");
    menu.add("육개장");
    menu.add("장어탕");
  }
  @Override
  public String getRecoMenu() {
    return menu.get((int)(Math.random() * 10) % 3);
  }
}
