package adapter;

public class TimeAdapter implements TotalTime{

    private Time time;
    @Override
    public int getTotalSeconds() {
        return time.getHours()*60*60 + time.getMinutes()*60 + time.getSeconds();
    }
}
