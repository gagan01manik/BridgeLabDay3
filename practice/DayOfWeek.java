package practice;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
        
        try {
            // Create LocalDate object
            LocalDate date = LocalDate.of(year, month, day);
            // Get day of the week
            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println("The day of the week for " + day + "/" + month + "/" + year + " is " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date entered. Please check the year, month, and day.");
        }
        
        scanner.close();
    }
}
