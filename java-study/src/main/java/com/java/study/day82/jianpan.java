package com.java.study.day82;

import java.util.Scanner;

public class jianpan {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入第一个数：");
            int a = sc.nextInt();
            System.out.print("请输入第二个数：");
            int b = sc.nextInt();
            System.out.print("请输入第三个数：");
            int c = sc.nextInt();
            int s = a > b ? a : b;
            int x = c > s ? c : s;
            System.out.println("最大值为："+x);
        }
    }
}
