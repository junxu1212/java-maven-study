package com.java.study.day84;

import java.util.Scanner;

public class whiledeyuju {
    public static void main(String[] args) {
//        循环四要素  初始化循环条件语句  循环条件判断 循环语句  循环迭代语句
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello woeld");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要循环的字符：");
        String str =sc.next();
        System.out.println("请输入要循环的次数：");
        int num= sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
        for (int i = 100; i >0 ; i--) {
            System.out.print(i+",");
        }
    }
}
