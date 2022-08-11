package com.java.study.day810;

public class test {
    public static void main(String[] args) {
        System.out.println("公鸡单价\t公鸡数量\t母鸡单价\t母鸡数量\t小鸡单价\t小鸡数量");
        for (int a = 0; a <= 20; a++) {
            for (int b = 0; b <= 33; b++) {
                int c = 100 - a - b;
                if (a + b + c == 100 && 5 * a + 3 * b + c / 3 == 100 && c % 3 == 0) {
                    System.out.printf("%7d%7d%7d%7d%7.1f%7d\n", 5, a, 3, b, 0.3, c);
                }
            }
        }
    }
}