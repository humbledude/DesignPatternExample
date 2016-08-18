package com.humbledude.examples.observer1.observer;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class AudioManager implements Observer {

  public static final String AUDIO_PATH_DEFAULT = "default";
  public static final String AUDIO_PATH_HDMI = "hdmi";

  private String currentAudioPath = AUDIO_PATH_DEFAULT;


  @Override
  public void update(boolean state) {
    if (state) {
      currentAudioPath = AUDIO_PATH_HDMI;
    } else {
      currentAudioPath = AUDIO_PATH_DEFAULT;
    }

    System.out.println("audio path is : " + currentAudioPath);
  }

}
