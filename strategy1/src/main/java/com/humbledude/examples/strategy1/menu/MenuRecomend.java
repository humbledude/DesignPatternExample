package com.humbledude.examples.strategy1.menu;

import com.humbledude.examples.strategy1.menu.MenuRecoAlgorithm;

/**
 * Created by keunhui.park on 2016. 8. 10..
 */
public class MenuRecomend {

  private MenuRecoAlgorithm algorithm;

  public MenuRecoAlgorithm getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(MenuRecoAlgorithm algorithm) {
    this.algorithm = algorithm;
  }

  public String getRecomendMenu() {
    return algorithm.getRecoMenu();
  }
}
