package com.humbledude.examples.observer1.device;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class HDMIObservable extends Observable {

  private boolean hdmiAttached;

  public boolean isHdmiAttached() {
    return hdmiAttached;
  }

  public void setHdmiAttached(boolean hdmiAttached) {
    this.hdmiAttached = hdmiAttached;
    notifyObservers();
  }
}
