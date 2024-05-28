package Lectures.week1.training1.chapter_59;

public class IncrementRunnable implements Runnable {
    private Counter counter;

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter.increment();
            System.out.println(counter.getCount());
        }
    }
}
