package com.Bridging;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public class Test {


    public static void main(String[] arg0) {

        /**厂家先造好，至于你们哪家公司要用，自己去用*/
        CpuAbility ability = new AMDCpu();
        CpuAbility ability1 = new IntelCpu();


        /*魅族手机和小米手机都用AMD芯片试试*/
        AbstractComputer AMDcomputer = new MeizuPad(ability);
        AbstractComputer AMDcomputer1 = new MiPad(ability);

        AMDcomputer.checkPcAbility();
        AMDcomputer1.checkPcAbility();


        System.out.println("\n");
        /*魅族手机和小米手机都用Intel芯片试试*/
        AbstractComputer Intelcomputer = new MeizuPad(ability1);
        AbstractComputer Intelcomputer1 = new MiPad(ability1);


        Intelcomputer.checkPcAbility();
        Intelcomputer1.checkPcAbility();

        System.out.println("\n");

        /*哎呦！有问题呦，魅族平板不是改用AMD的吗*/

        AMDcomputer.checkPcAbility();
        Intelcomputer1.checkPcAbility();


    }


}
