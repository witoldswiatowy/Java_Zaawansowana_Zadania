package pl.sdacademy.java.advanced.exercieses.day3.task35;

import pl.sdacademy.java.advanced.exercieses.day3.task34.MyThread;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread(); //tworzenie z zadania 34
        Thread thread1 = new Thread(new MyNewThread("job-1"));
        Thread thread2 = new Thread(new MyNewThread("job-2"));
//    thread2.start();

//    thread1.start();
//        TimeUnit.SECONDS.sleep(20);
//    thread1.interrupt();

        try {
            thread1.start();
            TimeUnit.SECONDS.sleep(20);
            thread1.interrupt();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("thread1 zpostał przerwany: " + e);
        }
    }
}
