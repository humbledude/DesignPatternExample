package com.humbledude.examples.abstractfactory.factory;

import com.humbledude.examples.abstractfactory.cpu.AMDCpu;
import com.humbledude.examples.abstractfactory.cpu.ICpu;
import com.humbledude.examples.abstractfactory.graphics.IGraphics;
import com.humbledude.examples.abstractfactory.graphics.OnboardGraphics;
import com.humbledude.examples.abstractfactory.memory.HynixMemory;
import com.humbledude.examples.abstractfactory.memory.IMemory;
import com.humbledude.examples.abstractfactory.storage.HDDStorage;
import com.humbledude.examples.abstractfactory.storage.IStorage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class LowCostPcFactory extends IPcFactory {

  @Override
  public ICpu createCPU() {
    return new AMDCpu();
  }

  @Override
  public IGraphics createGraphics() {
    return new OnboardGraphics();
  }

  @Override
  public IMemory createMemory() {
    return new HynixMemory();
  }

  @Override
  public IStorage createStorage() {
    return new HDDStorage();
  }
}
