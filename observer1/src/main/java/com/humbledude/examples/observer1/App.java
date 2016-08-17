package com.humbledude.examples.observer1;

import com.humbledude.examples.observer1.audiopath.AudioPathManager;
import com.humbledude.examples.observer1.device.AudioDeviceManager;
import com.humbledude.examples.observer1.device.BluetoothObservable;
import com.humbledude.examples.observer1.device.HDMIObservable;
import com.humbledude.examples.observer1.device.HeadsetObservable;
import com.humbledude.examples.observer1.device.USBObservable;
import com.humbledude.examples.observer1.device.Observable;

import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class App {

  public static void main (String[] args) {
    System.out.println("hello world!");

    AudioDeviceManager audioDeviceManager = new AudioDeviceManager();
    AudioPathManager audioPathManager = new AudioPathManager();

    audioDeviceManager.attachObserver(audioPathManager);


    // test
    List<Observable> deviceList = audioDeviceManager.getDeviceList();
    Observable s = deviceList.get(0);
    ((HeadsetObservable)s).setHeadsetAttached(true);


    s = deviceList.get(1);
    ((BluetoothObservable)s).setBluetoothAttached(true);
    ((BluetoothObservable)s).setBluetoothAttached(false);

    s = deviceList.get(2);
    ((USBObservable)s).setUsbAttached(true);

    s = deviceList.get(3);
    ((HDMIObservable)s).setHdmiAttached(true);
    ((HDMIObservable)s).setHdmiAttached(false);


  }
}
