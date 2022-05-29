package pl.sdacademy.java.advanced.exercieses.day3.task37;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task37 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new ThreadPlaygroundRunnable("task-" + i));
            System.out.println(executorService);
        }
executorService.shutdown();

    }
}
