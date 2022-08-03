package com.java.study.day83;

public class Testint {
    public static void main(String[] args) {
        byte va=(byte) 134;
//        打印输出默认打印的是原码  int 占据4个字节
        System.out.println(va);
//        位运算符的使用 四种基本的位运算符 & | ^ ~
        /*
        怎么区分逻辑运算符号和位运算符
        <<左移  >>右移  >>>无符号右移
        一般来所使用的比较少
        集合框架中大量使用位运算符
        & 左右补码二进制补码都为1
         */
        System.out.println(255&15);
    }
}
