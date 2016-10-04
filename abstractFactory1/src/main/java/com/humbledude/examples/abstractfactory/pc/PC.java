package com.humbledude.examples.abstractfactory.pc;

import com.humbledude.examples.abstractfactory.cpu.ICpu;
import com.humbledude.examples.abstractfactory.graphics.IGraphics;
import com.humbledude.examples.abstractfactory.memory.IMemory;
import com.humbledude.examples.abstractfactory.storage.IStorage;

/**
 * Created by keunhui.park on 2016. 10. 4..
 */
public class PC {

  private ICpu cpu;
  private IGraphics graphics;
  private IMemory memory;
  private IStorage storage;

  public ICpu getCpu() {
    return cpu;
  }

  public void setCpu(ICpu cpu) {
    this.cpu = cpu;
  }

  public IGraphics getGraphics() {
    return graphics;
  }

  public void setGraphics(IGraphics graphics) {
    this.graphics = graphics;
  }

  public IMemory getMemory() {
    return memory;
  }

  public void setMemory(IMemory memory) {
    this.memory = memory;
  }

  public IStorage getStorage() {
    return storage;
  }

  public void setStorage(IStorage storage) {
    this.storage = storage;
  }

  public int getPrice() {
    return cpu.getPrice() + graphics.getPrice() + memory.getPrice() + storage.getPrice();
  }

  public String getBom() {
    return cpu.getName() + ", "
        + graphics.getName() + ", "
        + memory.getName() + ", "
        + storage.getName();
  }

  public int getPerformance() {
    return cpu.getClockScore() + graphics.getScore() + memory.getIOScore() + storage.getIOScore();
  }
}
