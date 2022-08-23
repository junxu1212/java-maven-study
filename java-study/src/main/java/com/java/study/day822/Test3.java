package com.java.study.day822;

import com.sun.source.tree.UsesTree;

public class Test3 {
    /**
     * 可变参数
     * 修饰符 返回值类型 方法名（参数类型。。。 参数名）{
     *     方法体
     * }
     * 等价格式
     * （参数类型 【】 参数名）
     * onjava8  java核心技术第十一版  Java编程逻辑
 */
    public static void main(String[] args) {
        String a[]={"dada","fk","kk"};
//        setA(a);
        setA(a);
    }
//    String... a  这个必须作为形参列表
    public static void setA(String... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
