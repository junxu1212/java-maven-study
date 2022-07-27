package com.java.study.day727;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
//        算数运算 赋值运算 关系运算 逻辑运算 三元运算 位运算
//        括号可以改变优先级  赋值运算符是从右像左的（int a=0;）
//        一元 二元 三元 指的是操纵数的个数
        System.out.println(10 + 20);
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.printf("%d+%d=%d\n", a, b, a + b);
        System.out.printf("%d*%d=%d\n", a, b, a * b);
        System.out.printf("%d-%d=%d\n", a, b, a - b);
        System.out.printf("%d%%d=%d\n", a, b, a % b);
//        前置++先自增再运算  后置++先运算再自增
//        除法得到商  求余得到余数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int i1 = sc.nextInt();
        int i2 = i1 / 1000;
        int i3 = (i1 % 1000) / 100;
        int i4 = (i1 % 1000) / 10 % 10;
        int i5 = (i1 % 1000) % 100 % 10;
        System.out.println("" + i5 + i4 + i3 + i2);
//        扩展赋值运算符的使用注意事项，它是赋值之前会进行强制类型转换，然后将结果赋值给左边的变量
        byte aa=10;
        byte bb=20;
        byte cc=(byte) (aa+bb);
        System.out.println(cc);
    }
}
