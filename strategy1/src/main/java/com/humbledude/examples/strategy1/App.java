package com.humbledude.examples.strategy1;

import com.humbledude.examples.strategy1.menu.MenuAlgoBar;
import com.humbledude.examples.strategy1.menu.MenuAlgoDude;
import com.humbledude.examples.strategy1.menu.MenuAlgoFoo;
import com.humbledude.examples.strategy1.menu.MenuAlgoPika;
import com.humbledude.examples.strategy1.menu.MenuRecomend;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class App {

  public static void main(String[] args) {
    System.out.println("hello world!");

    MenuRecomend menu = new MenuRecomend();

    if (args.length == 0) {
      menu.setAlgorithm(new MenuAlgoPika());
    } else {
      switch(args[0]) {
        case "30M" :
          menu.setAlgorithm(new MenuAlgoDude());
          break;
        case "20F" :
          menu.setAlgorithm(new MenuAlgoFoo());
          break;
        case "40M" :
          menu.setAlgorithm(new MenuAlgoBar());
          break;
        case "50M" :
          menu.setAlgorithm(new MenuAlgoBar());
          break;
        default:
          menu.setAlgorithm(new MenuAlgoPika());
          break;
      }
    }

    System.out.println("today's menu : " + menu.getRecomendMenu());
  }
}
