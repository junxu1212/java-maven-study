package com.java.study.day823;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        int ll= sc.nextInt();
        int[] arl=test5.add(a,ll);
        System.out.println(Arrays.toString(arl));
    }
}
