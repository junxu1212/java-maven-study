package com.java.study.day726;

import static java.lang.Character.getType;

public class Leixinzhidonzhuanhuang {
    public static void main(String[] args) {
        float flmax=Float.MAX_VALUE;
        float flmin=(byte)Float.MIN_VALUE;
        System.out.println(flmax+","+flmin);
        System.out.printf("flmax\n",flmax);
        long lomax=Long.MAX_VALUE;
        System.out.println(lomax);
//        强制类型转换
//        数据类型  变量名=（更小的数据类型） 变量值
        int i=(byte) 10000000;
        System.out.println(i);
//        强制类型转换可能会导致精度的缺失
//        boolean不能和其他七种数据类型转换
//        强制类型转换可能会导致数据的溢出
//        byte short   char 运算时会先提升为int类型再参与运算
        short shortvalue=100;
        short svalue=100;
//        short sum=shortvalue+svalue;
        int sum=shortvalue+svalue;
        System.out.println(sum);
        System.out.println(getType(sum));
        int ll=100;
        System.out.println(getType(ll));
    }
}
