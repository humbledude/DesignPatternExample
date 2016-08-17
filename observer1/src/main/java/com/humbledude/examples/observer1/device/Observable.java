package com.humbledude.examples.observer1.device;

import com.humbledude.examples.observer1.audiopath.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public class Observable {

  private List<Observer> observers = new ArrayList<>();

  public void attach(Observer o) {
    observers.add(o);
  }

  public void detach(Observer o) {
    observers.remove(o);
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(this);
    }

  }
}
