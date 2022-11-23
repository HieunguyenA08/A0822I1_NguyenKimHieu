package ss04.Bai2;

public class StopWatch {
private int startTime ;
private int endTime ;

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
