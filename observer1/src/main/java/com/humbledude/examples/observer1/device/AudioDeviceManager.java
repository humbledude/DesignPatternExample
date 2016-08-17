package com.humbledude.examples.observer1.device;

import com.humbledude.examples.observer1.audiopath.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class AudioDeviceManager {

  private List<Observable> deviceList = new ArrayList<>();

  public AudioDeviceManager() {
    deviceList.add(new HeadsetObservable());
    deviceList.add(new BluetoothObservable());
    deviceList.add(new USBObservable());
    deviceList.add(new HDMIObservable());
  }

  public List<Observable> getDeviceList() {
    return deviceList;
  }

  public void setDeviceList(List<Observable> deviceList) {
    this.deviceList = deviceList;
  }

  public void attachObserver(Observer o) {
    for (Observable device : deviceList) {
      device.attach(o);
    }
  }

  public void detachObserver(Observer o) {
    for (Observable device : deviceList) {
      device.detach(o);
    }
  }
}
