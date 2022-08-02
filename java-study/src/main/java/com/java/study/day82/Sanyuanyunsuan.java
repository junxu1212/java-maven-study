package com.java.study.day82;

public class Sanyuanyunsuan {
    public static void main(String[] args) {
//        三元运算符形式    布尔表达式？结果1：结果2
//        表达式运行结果为true 那就执行结果1  否则执行结果2
        int a=10;
        int b=20;
        int max=a>b?a:b;
        int min=a<b?a:b;
        System.out.println(max+""+min);
//        结果类型一般情况下保持一致
//        结果也可以是表达式
    }
}
