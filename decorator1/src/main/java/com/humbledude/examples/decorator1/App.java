package com.humbledude.examples.decorator1;

import com.humbledude.examples.decorator1.effector.ChorusEffector;
import com.humbledude.examples.decorator1.effector.DelayEffector;
import com.humbledude.examples.decorator1.effector.DistortionEffector;
import com.humbledude.examples.decorator1.guitar.AcousticGuitar;
import com.humbledude.examples.decorator1.guitar.ElecGuitar;
import com.humbledude.examples.decorator1.guitar.Guitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public class App {

  public static void main(String[] args) {
    System.out.println("hello world!");

    Guitar elecGuitar = new ElecGuitar();
    elecGuitar = new DistortionEffector(elecGuitar);
    elecGuitar = new DelayEffector(elecGuitar);

    Guitar acousticGuitar = new ChorusEffector(new AcousticGuitar());

    System.out.println(elecGuitar.playSound());
    System.out.println(acousticGuitar.playSound());
  }
}
