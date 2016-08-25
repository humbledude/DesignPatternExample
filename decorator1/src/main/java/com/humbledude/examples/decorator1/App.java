package com.humbledude.examples.decorator1;

import com.humbledude.examples.decorator1.effector.ChorusEffector;
import com.humbledude.examples.decorator1.effector.DelayEffector;
import com.humbledude.examples.decorator1.effector.DistortionEffector;
import com.humbledude.examples.decorator1.guitar.AcousticGuitar;
import com.humbledude.examples.decorator1.guitar.ElecGuitar;

/**
 * Created by keunhui.park on 2016. 8. 25..
 */
public class App {

  public static void main(String[] args) {
    System.out.println("hello world!");

    DistortionEffector distortionEffector = new DistortionEffector(new ElecGuitar());
    DelayEffector delayEffector = new DelayEffector(distortionEffector);

    ChorusEffector chorusEffector = new ChorusEffector(new AcousticGuitar());

    System.out.println(delayEffector.playSound());
    System.out.println(chorusEffector.playSound());
  }
}
