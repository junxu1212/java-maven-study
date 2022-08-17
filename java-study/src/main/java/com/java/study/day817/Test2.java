package com.java.study.day817;

public class Test2 {
    public static void main(String[] args) {
        int sum=0;
        int a[][]={{10,20},{20,30},{30,40},{40,50}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("第"+i+"个元素中第"+j+"个值为："+a[i][j]);
                sum+=a[i][j];
            }
        }  System.out.println(sum);
        /**
         * 变量交换的方式
         * 1.通过中间变量交换
         * 2.通过算数运算交换
         * 3.通过位运算交换
         * */
    }
}
