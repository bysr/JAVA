package com.Bridging;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public class MeizuPad extends AbstractComputer {
    public MeizuPad(CpuAbility cpu) {
        super(cpu);
    }

    @Override
    public void checkPcAbility() {

        System.out.println("魅族手机"+cpu.Cpu());

    }
}
