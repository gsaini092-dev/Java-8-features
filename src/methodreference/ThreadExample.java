package methodreference;

public class ThreadExample {

    public static void threadStatus(){
        System.out.println("Thread is running - "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable runnable1 = ThreadExample::threadStatus;
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = ThreadExample::threadStatus;
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
