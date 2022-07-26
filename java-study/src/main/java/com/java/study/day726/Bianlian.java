package com.java.study.day726;

import java.math.BigDecimal;

public class Bianlian {
    public static void main(String[] args) {
//        变量定义格式  变量类型  变量名=变量值；
        int NUM=10;
        String Msg="msg";
        NUM = 20;
        System.out.println(NUM);
        System.out.println(Msg);
//        main方法内声明的变量都是局部变量
//        变量名不能同名，必须赋值
//        128~127
        byte b=100;
        short s=100;
        int i=100;
        long l=100l;
        System.out.print(b+","+s+","+i+","+l+"\n");
        char c='c';
        boolean bo=true;
        double d=0.01_8;
        float f=0.01f;
        System.out.println(c+","+bo+","+d+","+f);
//        浮点数运算又精度损失
        System.out.println(2.0-1.1);
//        变量值可以用科学计数发表示也可以用进制表示   do是关键字
        double dou=3.14e2;
        System.out.println(dou);
//        浮点数日常开发不会使用，因为又运算误差  这个和存储过程有关系  会使用到  BigDecimal
        char ch='a';
        System.out.println(ch);
//        对应Unicode编码值
        ch =97;
        System.out.println(ch);
//        转义字符 \n 换行 \\输出\   \t制表符  转义字符的底层存储的也是数字
//常量  程序运行过程中值是不可以变动的
//        final修饰的为常量  static为静态变量
        final  int number=10;
        System.out.println(number);
    }
}
