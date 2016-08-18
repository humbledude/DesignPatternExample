package com.humbledude.examples.strategy1.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class MenuAlgoPika implements MenuAlgorithm {

  private List<String> menu;

  public MenuAlgoPika() {
    menu = new ArrayList<>();
    menu.add("편도");
    menu.add("도시락");
    menu.add("라면");
  }
  @Override
  public String getRecoMenu() {
    return menu.get((int)(Math.random() * 10) % 3);
  }
}
