package org.example.execte;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {

    public Executor getExecutor(){

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
//        return Executors.newScheduledThreadPool(20);
        return null;


    }

    public static void main(String[] args) {
        ThreadPoolTest threadPoolTest = new ThreadPoolTest();
        threadPoolTest.getExecutor();
    }
}
