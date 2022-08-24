package com.java.study.day823;

public class test5 {
    public static int[] add(int[]a ,int e){
        if (a==null){
            return null;
        }
        int ar[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ar[i]=a[i];
        }
//        尾部添加元素
        ar[ar.length-1]=e;
        return ar;
    }
    public static int[] remove(int arr[],int el){
        int a=-1;
        if (a==-1){
            return null;
        }
        int arra[]=new int[arr.length-1];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (i!=el){
                arra[index]=arr[i];
                index++;
            }
        }return arra;
    }
}
