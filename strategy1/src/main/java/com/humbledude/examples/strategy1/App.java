package com.humbledude.examples.strategy1;

import com.humbledude.examples.strategy1.menu.MenuRecoAlgorithm;
import com.humbledude.examples.strategy1.menu.MenuRecoBar;
import com.humbledude.examples.strategy1.menu.MenuRecoDude;
import com.humbledude.examples.strategy1.menu.MenuRecoFoo;
import com.humbledude.examples.strategy1.menu.MenuRecoPika;
import com.humbledude.examples.strategy1.menu.MenuRecomend;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class App {

  public static void main(String[] args) {
    System.out.println("hello world!");

    MenuRecomend menu = new MenuRecomend();

    if (args.length == 0) {
      menu.setAlgorithm(new MenuRecoPika());
    } else {
      switch(args[0]) {
        case "30M" :
          menu.setAlgorithm(new MenuRecoDude());
          break;
        case "20F" :
          menu.setAlgorithm(new MenuRecoFoo());
          break;
        case "40M" :
          menu.setAlgorithm(new MenuRecoBar());
          break;
        case "50M" :
          menu.setAlgorithm(new MenuRecoBar());
          break;
        default:
          menu.setAlgorithm(new MenuRecoPika());
          break;
      }
    }

    System.out.println("today's menu : " + menu.getRecomendMenu());
  }
}
