package com.java.study.day824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
//    java面向对象
    /**
     * 面向对象和面向过程时两种编程思想
     * 编程思想实际上就是解决问题的方法
     * 早期的编程语言是面向过程的，例如c语言
     * 后来的编程语言是面向对象间的，比如c++ python  java
     * 面向对象是由面向过程发展而来
     *
     * 面向过程
     *  面向过程关注的是过程 必须要清楚每一步的步骤 然后一步一步实现 解决简单的问题可以使用面向过程的思想去实现
     * 面向过程
     *  面向对象关注的是对象 通过调用对象的行为去实现功能 不需要清楚每一步的实现步骤 解决复杂的问题可以使用面向对象的的思想去实现
     *
     * */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
