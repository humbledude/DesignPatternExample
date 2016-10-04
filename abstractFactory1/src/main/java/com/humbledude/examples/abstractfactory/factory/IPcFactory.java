package com.humbledude.examples.abstractfactory.factory;

import com.humbledude.examples.abstractfactory.cpu.ICpu;
import com.humbledude.examples.abstractfactory.graphics.IGraphics;
import com.humbledude.examples.abstractfactory.memory.IMemory;
import com.humbledude.examples.abstractfactory.pc.PC;
import com.humbledude.examples.abstractfactory.storage.IStorage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public abstract class IPcFactory {

  public PC createPC() {
    PC pc = new PC();
    pc.setCpu(createCPU());
    pc.setGraphics(createGraphics());
    pc.setMemory(createMemory());
    pc.setStorage(createStorage());

    return pc;
  }

  public abstract ICpu createCPU();
  public abstract IGraphics createGraphics();
  public abstract IMemory createMemory();
  public abstract IStorage createStorage();
}
