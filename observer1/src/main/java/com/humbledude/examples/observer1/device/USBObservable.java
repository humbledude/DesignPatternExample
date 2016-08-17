package com.humbledude.examples.observer1.device;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class USBObservable extends Observable {

  private boolean usbAttached;

  public boolean isUsbAttached() {
    return usbAttached;
  }

  public void setUsbAttached(boolean usbAttached) {
    this.usbAttached = usbAttached;
    notifyObservers();
  }
}
