package com.company;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Caja> cajas = new ArrayList<>();
        for (int i = 1; i < Math.random()*5+2; i++) {
            cajas.add(new Caja("Caja" + i));
        }

        for (Caja cj : cajas) {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                cj.start();
                executor.shutdown();
            });
        }
    }
}
/*    "\n"
        caja1.start();
        caja2.start();
        * */