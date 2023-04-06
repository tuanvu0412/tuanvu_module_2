package ss4_oop_java.bai_tap.StopWatch;

import java.time.LocalTime;

public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long millisecond = (endTime - startTime);
        return millisecond;
    }
}
