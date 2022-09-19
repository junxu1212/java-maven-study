package com.java.study.day919;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        Date date=new Date();
        java.sql.Date date1=new java.sql.Date(System.currentTimeMillis());
        System.out.println(date1);
//        在一个类中使用两个重名的类
//        第一个类keyiimport导入
//        第二个类必须使用包名加类名导入（全限定名）
    }
}
