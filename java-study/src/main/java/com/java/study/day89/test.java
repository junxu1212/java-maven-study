package com.java.study.day89;

public class test {
    public static void main(String[] args) {
//        break  可以用在分支和 循环
//        continue只能用在循环   后面不能在加代码
//        死循环：for（;;）{循环体}  while(true){循环体}
//        coed 是-1 异常退出  0表示正常退出
        for (int i = 0; i < 10; i++) {
            if (i==4){
                System.out.println("电梯停止");
            }
            System.out.println("电梯在上升");
        }
    }
}
