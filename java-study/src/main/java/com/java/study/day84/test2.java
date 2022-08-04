package com.java.study.day84;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("任意数任意个数值 直到输入0停止:");
//while循环注意迭代语句的编写  i++
        int sum = 0;
        int count = 0;
        int num=1;
        while (num != 0) {
             num = sc.nextInt();
            if (num > 1) {
                sum += 1;
                System.out.println(sum);
            } else {
                count += 1;
                System.out.println(count);
            }
        }
    }
}
