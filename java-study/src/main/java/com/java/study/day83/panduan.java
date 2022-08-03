package com.java.study.day83;

import java.util.Scanner;

public class panduan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入第一个数：");
            int a1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int a2 = sc.nextInt();
            if (a1 > a2) {
                System.out.printf("%d大于%d", a1, a2);
            } else if (a1 < a2) {
                System.out.printf("%d小于%d", a1, a2);
            } else {
                System.out.printf("%d等于%d", a1, a2);
            }
            System.out.println();
        }
    }
}
