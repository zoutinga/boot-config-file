package org.crazyit.boot.fkjava;

import java.util.Scanner;

//打印菱形
public class PrintLingxing {
    public static void main(String[] args) {
        int ROW =0;
        //控制台输入
        Scanner sc = new Scanner(System.in);
        ROW = sc.nextInt();
        //打印上半
        for (int i=0;i<ROW;i++){
            //输出空格
            for (int j=0;j<ROW-i-1;j++){
                System.out.print(" ");
            }
            //输出星号
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //打印下半
        for (int i=0;i<ROW-1;i++){
            //输出空格
            for (int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            //输出星号
            for (int j=0;j<2*ROW-2*i-3;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
