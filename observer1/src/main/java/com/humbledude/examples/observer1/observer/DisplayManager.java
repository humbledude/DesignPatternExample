package com.humbledude.examples.observer1.observer;

import com.humbledude.examples.observer1.observable.HDMIObservable;
import com.humbledude.examples.observer1.observable.Observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class DisplayManager implements Observer {

  public static final String DISPLAY_PATH_DEFAULT = "default";
  public static final String DISPLAY_PATH_HDMI = "hdmi";

  private String currentDisplayPath = DISPLAY_PATH_DEFAULT;

  @Override
  public void update(boolean state) {
    if (state) {
      currentDisplayPath = DISPLAY_PATH_HDMI;
    } else {
      currentDisplayPath = DISPLAY_PATH_DEFAULT;
    }

    System.out.println("display path is : " + currentDisplayPath);

  }


}
