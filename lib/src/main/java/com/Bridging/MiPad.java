package com.Bridging;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public class MiPad extends AbstractComputer {
    public MiPad(CpuAbility cpu) {
        super(cpu);
    }

    @Override
    public void checkPcAbility() {

        System.out.println("小米笔记本性能" + super.cpu.Cpu());


    }
}
