package com.Facade;

/**
 * Created by wangyawen on 2017/1/18 0018.
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;


    public Computer() {

        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("start the computer");

        cpu.startup();
        memory.startup();
        disk.startup();


    }

    public void shutdown() {
        System.out.println("start the computer");

        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();


    }


}
