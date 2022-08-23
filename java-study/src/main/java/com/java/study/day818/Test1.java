package com.java.study.day818;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int tem = 0;
        int a[] = {1, 2, 76, 465, 43, 56, 76, 34, 5, 4};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j+1] > a[j]) {
                    tem = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
