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
    }
//    java7以前是没有String类型的 只支持int 和枚举类型   输入的byte char类型自动转为int类型
}
