package com.java.study.day816;

public class Test2 {
    public static void main(String[] args) {
        int sco[]={100,90,80};
        System.out.println(sco);
//内存地址发生变化
        sco=new int[]{12,13,1414};
        System.out.println(sco);
    }
}
