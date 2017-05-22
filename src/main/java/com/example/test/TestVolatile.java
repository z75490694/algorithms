package com.example.test;

/**
 * Created by WHZ on 2017/4/16.
 */
public class TestVolatile {

    public static  volatile int count = 0;

    static volatile boolean  stop = false;

    public static void setCount(){

        while(!stop){

        }

        System.out.print("break");
    }

    public static void getCount(){


        stop = true;
    }

    public static void main(String[] args){
       // final TestVolatile sd = new TestVolatile();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    setCount();
                }
            },"set").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
                    @Override
                    public void run() {
                        getCount();
                    }
                },"get").start();






    }
}
