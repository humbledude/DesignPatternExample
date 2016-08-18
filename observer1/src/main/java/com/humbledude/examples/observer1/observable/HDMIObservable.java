package com.humbledude.examples.observer1.observable;

import com.humbledude.examples.observer1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class HDMIObservable implements Observable {

  private List<Observer> observerList = new ArrayList<>();

  private boolean hdmiAttached;

  public boolean isHdmiAttached() {
    return hdmiAttached;
  }

  public void setHdmiAttached(boolean hdmiAttached) {
    this.hdmiAttached = hdmiAttached;
    System.out.println("HDMI cable connection : " + this.hdmiAttached);
    notifyObservers();
  }



  @Override
  public void attach(Observer o) {
    observerList.add(o);
  }

  @Override
  public void detach(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observerList) {
      o.update(hdmiAttached);
    }
  }
}
