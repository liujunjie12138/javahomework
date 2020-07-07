package club.banyuan;

public class TimerImplement implements Timer{

    private long timeStart;
    private long timeStop;
    @Override
    public void start() throws IllegalStateException {
        if(timeStart!=0&&timeStop!=0){
            throw new IllegalStateException("starting already");
        }
        timeStart=System.currentTimeMillis();
    }

    @Override
    public void stop() throws IllegalStateException {
        if (timeStart==0&&timeStop!=0){
            throw new IllegalStateException("not starting");
        }
        timeStop=System.currentTimeMillis();

    }

    @Override
    public void reset() {
        timeStart=0;
        timeStop=0;
    }

    @Override
    public long getTimeMillisecond() {
        return timeStop-timeStart;
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public long getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(long timeStop) {
        this.timeStop = timeStop;
    }
}
