package com.java.study.day84;

import java.util.Scanner;

public class study {
    public static void main(String[] args) {
        int i;
        for (i = 2; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 100 % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i + "是水仙花数");
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        if (num < 100 || num > 1000) {
            System.out.println("请输入一个大于100小于1000的数");
        } else {
                int a = num / 100;
                int b = num % 100 / 10;
                int c = num % 100 % 10;
                if (a * a * a + b * b * b + c * c * c == num) {
                    System.out.println(num + "是水仙花数");
            }
        }
    }
}
