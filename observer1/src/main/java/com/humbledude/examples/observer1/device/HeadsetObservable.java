package com.humbledude.examples.observer1.device;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class HeadsetObservable extends Observable {

  private boolean headsetAttached;

  public boolean isHeadsetAttached() {
    return headsetAttached;
  }

  public void setHeadsetAttached(boolean headsetAttached) {
    this.headsetAttached = headsetAttached;
    notifyObservers();
  }
}
