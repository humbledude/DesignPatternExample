package com.humbledude.examples.observer1.observable;

import com.humbledude.examples.observer1.observer.Observer;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public interface Observable {

  void attach(Observer o);
  void detach(Observer o);
  void notifyObservers();
}
