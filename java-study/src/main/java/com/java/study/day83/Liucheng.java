package com.java.study.day83;

import java.util.Scanner;

public class Liucheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
//        while (true) {
            int age = sc.nextInt();
            if (age >= 18&&age<=100) {
                System.out.println("你可以嘿嘿嘿");
            }else if (age>100){
                System.out.println("老妖怪");
            }
            else {
                System.out.println("滚！");
            }
//        }
        Scanner aa=new Scanner(System.in);
        System.out.print("请输入一个数：");
            int va=aa.nextInt();

        if (va%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
//        if如果只有一行语句的时候花括号可以不加
        if(1>4)
            System.out.println("真的");
        else
            System.out.println("假的");

    }
}
