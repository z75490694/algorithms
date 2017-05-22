package com.example.test;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by WHZ on 2017/4/16.
 */
public class TestExecutor {

    public static void main(String[] args){
        /*LiftOff launch = new LiftOff();
        launch.run();*/
        ExecutorService exec = Executors.newCachedThreadPool();
        /*for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();*/
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i=0;i<5;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for(Future<String> fs:results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }

        }
    }
}

class LiftOff implements Runnable{

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+"),";

    }


    @Override
    public void run() {
        while (countDown-->0){
            System.out.print(status());
            Thread.yield();
        }
    }
}

class TaskWithResult implements Callable<String>{

    private int id;
    public TaskWithResult(int id){
        this.id = id;

    }
    @Override
    public String call(){
        return "result of TaskWithResult "+ id;
    }

}
