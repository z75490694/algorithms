package com.example.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by WHZ on 2017/4/15.
 */
public class  ThreadSynchronization {

    final Integer a =4;
    public synchronized void  test1(){

        synchronized (a){
            int i = 5;
            while(i-->0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ie){

                }
            }
        }
    }

    public synchronized void test2(){
        synchronized(a){
            int i = 5;
            while(i-->0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ie){

                }
            }
        }

    }
    Lock lock = new ReentrantLock();
    public void test3(){
        lock.lock();

            try{
                while(j-->0){
                    System.out.println(Thread.currentThread().getName()+":"+j);
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException ie){

                    }
                }
            }finally {
                lock.unlock();
            }


    }

    int j = 5;

    public synchronized void test4(){

        while(j-->0){
            System.out.println(Thread.currentThread().getName()+":"+j);
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){

            }
        }
    }

    public  void test5(){


    }

    public static void main(String[] args){
        final ThreadSynchronization myt2 = new ThreadSynchronization();
        Thread test1 = new Thread(  new Runnable() {  public void run() {  myt2.test3();  }  }, "test1"  );
        Thread test2 = new Thread(  new Runnable() {  public void run() { myt2.test3();   }  }, "test2"  );
        test1.start();
        test2.start();
    }
}
