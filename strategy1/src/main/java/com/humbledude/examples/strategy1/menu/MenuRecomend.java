package com.humbledude.examples.strategy1.menu;

/**
 * Created by keunhui.park on 2016. 8. 10..
 */
public class MenuRecomend {

  private MenuAlgorithm algorithm;

  public MenuAlgorithm getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(MenuAlgorithm algorithm) {
    this.algorithm = algorithm;
  }

  public String getRecomendMenu() {
    return algorithm.getRecoMenu();
  }
}
