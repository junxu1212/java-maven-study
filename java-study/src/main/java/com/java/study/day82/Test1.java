package com.java.study.day82;

public class Test1 {
    public static void main(String[] args) {
//        逻辑与的使用
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println("====================");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println("====================");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println("====================");
        System.out.println(! true);
        System.out.println(! false);
        System.out.println(!!false);
        System.out.println(!!!true);
        System.out.println("====================");
        int left=10;
        int rightt=20;
//        一旦前面的成立了 后面的就不运算了  所以开发中多数使用短路逻辑符
//        因为性能高一些
        boolean f=left++>10&&rightt--<20;
        System.out.println(left);
        System.out.println(rightt);
    }
}
