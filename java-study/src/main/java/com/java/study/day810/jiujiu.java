package com.java.study.day810;

public class jiujiu {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d\t",j,i,i*j);
//只要是表格都要使用嵌套的循环来遍历
//                都是用debug
            }
        }
    }
}
