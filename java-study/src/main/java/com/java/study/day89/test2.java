package com.java.study.day89;

public class test2 {
    public static void main(String[] args) {
         int height=88488600;
         int pa=1;
         int count=0;
         while (pa<=height){
             pa*=2;
             count++;
         }
        System.out.println(count+","+pa);

    }
}
