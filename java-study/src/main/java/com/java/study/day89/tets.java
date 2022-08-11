package com.java.study.day89;

import java.util.Random;
import java.util.Scanner;

public class tets {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int i = sc.nextInt();
            Random a = new Random();
//            产生0到100的随机数不加1就是到99
            int aa = a.nextInt(100)+1;
            if (i == aa) {
                System.out.println("你猜对了" + aa);
                break;
            } else {
                System.out.println("你猜错了" + aa);
            }
        }
    }
}
