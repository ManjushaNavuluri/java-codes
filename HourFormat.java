package examplesPrograms;

public class HourFormat {
    public static void main(String[] args) {
        String time = "09:17:45PM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        int hours = Integer.parseInt(parts[0]);
        String minutes = parts[1];
        String seconds = parts[2].substring(0, 2);
        String ampm = parts[2].substring(2);

        if (ampm.equals("AM")) {
            if (hours == 12) {
                hours = 0;
            }
        } else {
            if (hours != 12) {
                hours += 12;
            }
        }

        return String.format("%02d:%s:%s", hours, minutes, seconds);
    }
}