package com.humbledude.examples.abstractfactory.factory;

import com.humbledude.examples.abstractfactory.cpu.ICpu;
import com.humbledude.examples.abstractfactory.cpu.IntelCpu;
import com.humbledude.examples.abstractfactory.graphics.IGraphics;
import com.humbledude.examples.abstractfactory.graphics.NvidiaGraphics;
import com.humbledude.examples.abstractfactory.memory.IMemory;
import com.humbledude.examples.abstractfactory.memory.SamsungMemory;
import com.humbledude.examples.abstractfactory.storage.IStorage;
import com.humbledude.examples.abstractfactory.storage.SSDStorage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class HighEndPcFactory extends IPcFactory{

  @Override
  public ICpu createCPU() {
    return new IntelCpu();
  }

  @Override
  public IGraphics createGraphics() {
    return new NvidiaGraphics();
  }

  @Override
  public IMemory createMemory() {
    return new SamsungMemory();
  }

  @Override
  public IStorage createStorage() {
    return new SSDStorage();
  }
}
