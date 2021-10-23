package com.company;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja("caja1");
        Caja caja2 = new Caja("caja2");
        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        executor1.submit(() -> {
            caja1.start();
            executor1.shutdown();
        });

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        executor2.submit(() -> {
            caja2.start();
            executor2.shutdown();
        });
    }
}
/*
*
        caja1.start();
        caja2.start();
        * */