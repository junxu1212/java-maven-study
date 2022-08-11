package com.java.study.day89;

public class test1 {
    public static void main(String[] args) {
        int count = 0;
        double i = 0.0001;
        while (true) {
            i = i * 2;
            final double v = 8848.86;
            if (i >=v) {
                System.out.println("大于");
                break;
            }
            count++;
        }
        System.out.println(count);
        for (; ; ) {
            if (i >= 8848.86) {
                System.out.println("大于");
                break;
            }
            count++;
        }
        System.out.println(count);
        int sum=0;
        System.out.println("===========");
        double l=0.0001;
    while (l<=8848.86){
        l*=2;
        sum++;
    }
        System.out.println(l +","+sum);
    }
//    使用BigDecimal类运算浮点数

}
