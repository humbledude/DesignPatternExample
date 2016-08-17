package com.humbledude.examples.observer1.device;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class BluetoothObservable extends Observable {

  private boolean bluetoothAttached;

  public boolean isBluetoothAttached() {
    return bluetoothAttached;
  }

  public void setBluetoothAttached(boolean bluetoothAttached) {
    this.bluetoothAttached = bluetoothAttached;
    notifyObservers();
  }
}
