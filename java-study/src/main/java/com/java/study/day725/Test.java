package com.java.study.day725;

import static java.lang.Character.getType;

public class Test {
    public static void main(String[] args) {
//        命名规约  Alibaba插件下载 去github、Alibaba看命名规范
        int i=100;
        System.out.println(getType(i));
//        想要得到数据类型需要自定义方法

    }
    public static String getType(Object o){
        return o.getClass().toString();
    }
    public static String getType(int o){
        return "int";
    }
}
