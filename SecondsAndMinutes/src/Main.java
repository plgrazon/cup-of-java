public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int totalMinutes = minutes + (seconds / 60);
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        String hoursString = hours < 10 ? "0" + hours + "h" : hours + "h";
        String minutesString = remainingMinutes < 10 ? "0" +  remainingMinutes + "m" : remainingMinutes + "m";
        String secondsString = seconds < 10 ? "0" + seconds + "s" : seconds + "s";

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int secs = seconds % 60;

        return getDurationString(minutes, secs);
    }
}