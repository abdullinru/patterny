package adapter;

public class TotalTimeAdapter implements Time{

    private TotalTime totalTime;

    public TotalTimeAdapter(TotalTime totalTime) {
        this.totalTime = totalTime;
    }
    @Override
    public int getHours() {
        return totalTime.getTotalSeconds() / (60*60);
    }

    @Override
    public int getMinutes() {
        return (totalTime.getTotalSeconds() % (60*60)) / 60;
    }

    @Override
    public int getSeconds() {
        return totalTime.getTotalSeconds() % 60;
    }
}
