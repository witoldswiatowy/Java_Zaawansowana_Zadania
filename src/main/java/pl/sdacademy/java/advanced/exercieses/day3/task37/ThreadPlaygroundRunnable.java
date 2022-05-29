package pl.sdacademy.java.advanced.exercieses.day3.task37;

public class ThreadPlaygroundRunnable implements Runnable{
    private final String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start: " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end: " + name);
    }
}
