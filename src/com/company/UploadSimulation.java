package com.company;

import java.util.concurrent.CountDownLatch;

public class UploadSimulation extends Thread {

    private CountDownLatch cld;

    public UploadSimulation(CountDownLatch cld) {
        this.cld = cld;

    }

    public void run() {
        try {
            for (int i = 0; i < 25 ; i++) {

                System.out.print("■");
                sleep(500);
            }
            System.out.println(" Файл загружен на сервер ");
            cld.countDown();
        } catch (Exception e){

        }

    }


}
