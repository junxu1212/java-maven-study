package com.java.study.day817;

public class Test {
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(a);
        int b[]=a;
        System.out.println(b);
//        [I@6e8dacdf
//[I@6e8dacdf   这两个的哈希值是一样的
//        数组常见问题   空指针异常  索引越界
        b=null;
        System.out.println(b[0]);
    }
}
