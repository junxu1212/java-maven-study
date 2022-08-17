package com.java.study.day817;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        int s=0;
        int e= a.length-1;
        while (s<e){
            a[s]=a[s]^a[e];
            a[e]=a[s]^a[e];
            a[s]=a[s]^a[e];
            s++;
            e--;
        }
        System.out.println(Arrays.toString(a));

        int c[]={1,2,3,4,5};
        for (int i = (c.length-1); i >=0 ; i--) {
            System.out.println(c[i]);
        }
        }
    }
