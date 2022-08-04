package com.java.study.day84;

public class test1 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%2==0){
                System.out.print(i+"是偶数，");
            }else {
                System.out.print(i+"是奇数，");
            }
        }
        int sum=0;
        for (int i = 0; i < 101; i++) {
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
