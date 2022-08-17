package com.java.study.day817;

import java.util.Arrays;

public class Test44 {
    public static void main(String[] args) {
        int aa[]={1,2,3,4,5};
        int k;
        int j;
//        k=0, j= aa.length-1;k<=j;k++,j--
        for (k=0, j= aa.length-1;k<=j;k++,j--){
            int tem=aa[k];
            aa[k]=aa[j];
            aa[j]=tem;
        }
        System.out.println(Arrays.toString(aa));
    }
}
