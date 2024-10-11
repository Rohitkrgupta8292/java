package dateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        // Get current date and time objects.
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MMM-yyyy, hh:mm a");

        // display current time and date.
        System.out.println(currentTime);
        System.out.println(currentDate);
        System.out.println(currentDateTime);

        // formatting the currentDateTime.
        String formattedDateTime = currentDateTime.format(formatted);
        System.out.println(formattedDateTime);
    }
}
