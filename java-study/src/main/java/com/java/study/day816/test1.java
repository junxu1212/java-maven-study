package com.java.study.day816;

public class test1 {
    public static void main(String[] args) {
//        一个int占四个字节
        int a[]={10,20,30};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        char b[]={'a','b','c'};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
//        [i  表示数组
//        @ 分隔符
//        7c30a02  十六进制哈希值
//        char默认值\u0000 int 0  double 0.0  Boolean false
        System.out.println('\u0000');
//        数组的动态初始化  不许又定义长度的同时又定义元素个数
        /*
        堆内存：
        * new出啦爹的数据都存储在堆内存中
        * 堆内存中的数据都有个地址
        * 在地质区域的数据都有默认值
        * 当堆内存的数据没有任何指向就会被gc当成垃圾数据，但是不会立即清理，通常实在系统清闲的时候清理
        *栈内存：
        存储正在运行的方法
        栈内存的存储特点  先进后出（类似弹夹  先进去的后出来）
        */
    }
}
