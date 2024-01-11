package DesafiosAula;

/*
create two method with the same name
- one with one parameter (seconds)
- one with two parameters (minutes, seconds)
- return the duration as string
- 1 minute = 60 seconds
- 1 hour = 60 minutes
 */

public class OverloadingTime {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){
        int minutes = seconds / 60;
        seconds -= minutes * 60;

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;
        minutes -= hours * 60;

        return hours + "h " + minutes + "m " + seconds + "s";

    }
}
