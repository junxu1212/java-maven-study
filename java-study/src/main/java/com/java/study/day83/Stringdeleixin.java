package com.java.study.day83;

import java.util.Scanner;

public class Stringdeleixin {
    public static void main(String[] args) {
        String str="你好！";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入性别：");
        String s=sc.next();
        switch (s){
            case "男":
                str+="先生";break;
            case "女":
                str+="女士";
            default:
                str+="顾客";break;
        }
        System.out.println(str);
        System.out.println("请输入一个数：");
        int a= sc.nextInt();
        switch (a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
//                switch穿透现象  流程是走了一个case遇到breack才会停止但是这里面是没有停止的
//            会一直运行到5才break  值不同但是结果是一样的就可以用case穿透
        }
    }
//    java7以前是没有String类型的 只支持int 和枚举类型   输入的byte char类型自动转为int类型

}
