package org.crazyit.boot.fkjava;

import java.util.Scanner;
//空心三角形
public class Kongxin {
    public static void main(String[] args) {
        int ROW =0;
        //控制台输入
        Scanner sc = new Scanner(System.in);
        ROW = sc.nextInt();
        //打印一行 上半
        for (int i=0;i<ROW;i++){
            //输出空格
            for (int j=0;j<ROW-i-1;j++){
                System.out.print(" ");
            }
            //输出一个星号
            System.out.print("*");
            //输出空格
            for (int j=0;j<2*i-1;j++){
                System.out.print(" ");
             }
             if(i==0){
                 System.out.print("");
             }else{
                 System.out.print("*");
             }
            System.out.println();
        }
        //打印一行 下半
        for (int i=0;i<ROW-1;i++){
            //输出空格
            for (int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            //输出一个星号
            System.out.print("*");
            //输出空格
            for (int j=0;j<2*ROW-2*i-5;j++){
                System.out.print(" ");
            }
            if(i!=ROW-2){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
