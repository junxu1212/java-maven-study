package com.java.study.day822;

public class Test1 {
    /**
     * main方法是被jvm调用的
     * 程序是由多个类配置文件 业务数据组成
     * 类通常都是包含了多个不同功能的方法
     * 方法就是封装了特定功能模块的代码块
     * 方法的定义及使用
     * 1。方法分为有返回值  无返回值
     *方法调用都是实参  方法中是形参
     *
     * 加了static才能直接调用
    */
    public static void main(String[] args) {
        int a=10;int b=20;
        int c=add(a,b);
        System.out.println(c);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
