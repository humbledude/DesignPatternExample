package com.humbledude.examples.strategy1;

import com.humbledude.examples.strategy1.menu.MenuRecoAlgorithm;
import com.humbledude.examples.strategy1.menu.MenuRecoBar;
import com.humbledude.examples.strategy1.menu.MenuRecoDude;
import com.humbledude.examples.strategy1.menu.MenuRecoFoo;
import com.humbledude.examples.strategy1.menu.MenuRecoPika;

/**
 * Created by keunhui.park on 2016. 8. 5..
 */
public class App {

  public static void main(String[] args) {
    System.out.println("hello world!");

    MenuRecoAlgorithm algo;

    if (args.length == 0) {
      algo = new MenuRecoPika();
    } else {
      switch(args[0]) {
        case "30M" :
          algo = new MenuRecoDude();
          break;
        case "20F" :
          algo = new MenuRecoFoo();
          break;
        case "40M" :
          algo = new MenuRecoBar();
          break;
        case "50M" :
          algo = new MenuRecoBar();
          break;
        default:
          algo = new MenuRecoPika();
          break;
      }
    }

    System.out.println("today's menu : " + algo.getRecoMenu());
  }
}
