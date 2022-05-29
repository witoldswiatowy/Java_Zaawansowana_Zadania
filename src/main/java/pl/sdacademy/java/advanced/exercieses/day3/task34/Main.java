package pl.sdacademy.java.advanced.exercieses.day3.task34;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

    thread1.start();
    thread2.start();

    }
}
