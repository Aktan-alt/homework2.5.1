package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class DownloadSimulation extends Thread {
    private Semaphore semaphore;

    private CountDownLatch cdl;

    public DownloadSimulation(String name, CountDownLatch cdl,Semaphore semaphore) {
        super(name);
        this.cdl = cdl;
        this.semaphore = semaphore;
    }


    public void run(){
        try {

            System.out.println(" Падал запрос на скачивание!!");
            semaphore.acquire();
            System.out.println(this.getName() + "Начал загрузку");
            sleep(1000);
            System.out.println(this.getName() + "Закончил загрузку");
            semaphore.release();

            cdl.countDown();
            cdl.await();
        }catch (Exception e){


        }
    }
}
