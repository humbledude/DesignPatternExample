package com.humbledude.examples.observer1.audiopath;

import com.humbledude.examples.observer1.device.BluetoothObservable;
import com.humbledude.examples.observer1.device.HDMIObservable;
import com.humbledude.examples.observer1.device.HeadsetObservable;
import com.humbledude.examples.observer1.device.Observable;
import com.humbledude.examples.observer1.device.USBObservable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class AudioPathManager implements Observer {

  public static final String AUDIO_PATH_SPEAKER = "speaker";
  public static final String AUDIO_PATH_HEADSET = "headset";
  public static final String AUDIO_PATH_BLUETOOTH = "bluetooth";
  public static final String AUDIO_PATH_USB = "usb";
  public static final String AUDIO_PATH_HDMI = "hdmi";

  private List<String> deviceList = new ArrayList<>();

  private String currentAudioPath = AUDIO_PATH_SPEAKER;

  private Map<String, Boolean> deviceMap = new HashMap<>();

  public AudioPathManager() {
    deviceMap.put(AUDIO_PATH_SPEAKER, true);
    deviceMap.put(AUDIO_PATH_HEADSET, false);
    deviceMap.put(AUDIO_PATH_BLUETOOTH, false);
    deviceMap.put(AUDIO_PATH_USB, false);
    deviceMap.put(AUDIO_PATH_HDMI, false);

    deviceList.add(AUDIO_PATH_HDMI);
    deviceList.add(AUDIO_PATH_USB);
    deviceList.add(AUDIO_PATH_BLUETOOTH);
    deviceList.add(AUDIO_PATH_HEADSET);
    deviceList.add(AUDIO_PATH_SPEAKER);
  }

  @Override
  public void update(Observable s) {

    String device = null;
    boolean state = false;
    if (HeadsetObservable.class.equals(s.getClass())) {
      device = AudioPathManager.AUDIO_PATH_HEADSET;
      state = ((HeadsetObservable)s).isHeadsetAttached();
    } else if (BluetoothObservable.class.equals(s.getClass())) {
      device = AudioPathManager.AUDIO_PATH_BLUETOOTH;
      state = ((BluetoothObservable)s).isBluetoothAttached();
    } else if (USBObservable.class.equals(s.getClass())) {
      device = AudioPathManager.AUDIO_PATH_USB;
      state = ((USBObservable)s).isUsbAttached();
    } else if (HDMIObservable.class.equals(s.getClass())) {
      device = AudioPathManager.AUDIO_PATH_HDMI;
      state = ((HDMIObservable)s).isHdmiAttached();
    }

    if (device != null) {
       setAudioDeviceState(device, state);
    }

  }

  public String getCurrentAudioPath() {
    return currentAudioPath;
  }

  private void setCurrentAudioPath(String currentAudioPath) {
    this.currentAudioPath = currentAudioPath;
    System.out.println("audio path is changed to " + this.currentAudioPath);
  }

  private void setAudioDeviceState(String device, boolean state) {
    deviceMap.put(device, state);

    for (String d : deviceList) {
      if (deviceMap.get(d)) {
        setCurrentAudioPath(d);
        break;
      }
    }
  }


}
