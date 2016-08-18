package com.humbledude.examples.observer1;

import com.humbledude.examples.observer1.observer.AudioManager;
import com.humbledude.examples.observer1.observable.HDMIObservable;
import com.humbledude.examples.observer1.observable.Observable;
import com.humbledude.examples.observer1.observer.DisplayManager;

import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class App {

  public static void main (String[] args) {
    System.out.println("hello world!");

    HDMIObservable hdmiObservable = new HDMIObservable();

    AudioManager audioManager = new AudioManager();
    DisplayManager displayManager = new DisplayManager();

    hdmiObservable.attach(audioManager);
    hdmiObservable.attach(displayManager);

    //test
    hdmiObservable.setHdmiAttached(true);
    hdmiObservable.setHdmiAttached(false);
    hdmiObservable.setHdmiAttached(true);



  }
}
