import java.util.*;

public class NextMeetingDay {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        public static Day getNextDay(Day day) {
            return values()[(day.ordinal() + 1) % values().length];     //Note: values() has parenthesis and length has no parenthesis
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toUpperCase();
        scanner.close();

        try {
            Day currentDay = Day.valueOf(input);
            System.out.println(Day.getNextDay(currentDay));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }
    }
}
