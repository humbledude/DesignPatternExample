package com.humbledude.examples.observer1.observer;

import com.humbledude.examples.observer1.observable.Observable;

/**
 * Created by keunhui.park on 2016. 8. 17..
 */
public interface Observer {
  void update(boolean state);
}
