package com.Bridging;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public abstract class AbstractComputer {
    public CpuAbility cpu;

    public AbstractComputer(CpuAbility cpu) {
        this.cpu = cpu;
    }

    public abstract void checkPcAbility();

}
