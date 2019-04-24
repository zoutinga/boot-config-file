package org.crazyit.boot.fkjava;

public class ThreadTest extends Thread{
    @Override
    public void  run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread()+"---"+i);
        }
    }
    public static void main(String[] args) {
        ThreadTest mythread = new ThreadTest();
        mythread.run();
    }


}
