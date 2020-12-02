package statements;

public class Time {

    private int hour;
    private int minutes;
    private int secconds;

    public Time(int hour, int minutes, int secconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.secconds = secconds;
    }

    public int getInMinutes() {
        return ( (hour* 60) + minutes );
    }

    public int getInSeconds() {
        return ( (minutes * 60 ) + (hour * 3600) + secconds);
    }

    public String toString(int parHour, int parMinutes, int parSeconds) {
        String format = parHour + ":" + parMinutes + ":" + parSeconds;
        return format;
    }

    // innentől puskáztam
    public boolean earlierThan(Time other) {
     int elsoTimeInSeconds = this.getInSeconds();
     int masodikTimeInSeconds = other.getInSeconds();
     return elsoTimeInSeconds < masodikTimeInSeconds;

    }




}
