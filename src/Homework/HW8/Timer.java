package Homework.HW8;

public class Timer {

    long timeStart;
    boolean isRunning;

    public Timer() {
        this.isRunning = false;
    }

    public long time() {
        return System.currentTimeMillis();
    }

    public void start() {
        if (!this.isRunning) {
            this.timeStart = System.currentTimeMillis();
            this.isRunning = true;
        }
    }

    public long stop() {
        if (isRunning) {
            isRunning = false;
            return (System.currentTimeMillis() - timeStart);
        } else {
            return -1;
        }
    }

}
