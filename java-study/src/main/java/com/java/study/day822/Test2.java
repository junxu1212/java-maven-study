package com.java.study.day822;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(bijiao(a, b));
        int s[] = {1, 2, 3, 4, 3, 54, 3};
        shuzu(s);
    }

    public static String bijiao(int a, int b) {
        if (a == b) {
            return "相等";
        } else if (a > b) {
            return "大于";
        } else {
            return "小于";
        }
    }

    public static void shuzu(int a[]) {
        int tem = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
