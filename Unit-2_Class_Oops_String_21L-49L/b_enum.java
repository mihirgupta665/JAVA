import java.util.Scanner;

public class b_enum {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim().toUpperCase();

        Day[] days = Day.values();
        boolean isValid = false;

        for (int i = 0; i < days.length; i++) {
            if (days[i].name().equals(input)) {
                System.out.println(days[(i + 1) % days.length]);
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            System.out.println("Invalid Input");
        }
    }
}
