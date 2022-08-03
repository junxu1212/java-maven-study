package com.java.study.day83;

import java.util.Scanner;

public class qiantao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数:");
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println(1);break;
            case 2:
                System.out.println(2);break;
            default:
                System.out.println("其他");
                break;
        }
    }
}
