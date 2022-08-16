package com.java.study.day815;

public class shuzu {
    public static void main(String[] args) {
        /*
        * 静态初始化
        * int 【】 a=new int【】{元素1，元素2，。。。}
        * int 【】 a={元素1，元素2，。。。}
        * 动态初始化
        * */
        int a[]={10,20,30};
        System.out.println(a[0]);
//        注意索引越界问题
//        System.out.println(a[4]);
    }
}
