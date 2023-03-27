package kg.kadyrbekov;


public class Time {

    private int hour;

    private double minute;

    private int second;


    public Time(int hour, double minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time() {
    }

    public Time(double minute) {
        this.minute = minute;
    }

    public Time(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
