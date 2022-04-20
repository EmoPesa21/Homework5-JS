import java.util.Scanner;

public class MonthsDays {
    public static void main(String[] args) {
        int Month = 0;
        int Day = 0;

        boolean Months = (3 >= Month) && (Month <= 6);
        boolean Days = 20 >= Day && Day <= 20;
        System.out.println("Enter Month: ");
        Scanner scanner = new Scanner(System.in);
        Month = scanner.nextInt();

        System.out.println("Enter Day: ");
        Day = scanner.nextInt();
        if (Months) {
            System.out.println("Is Valid");
        } else {
            System.out.println("Not Valid");
        }
        if (Days) {
            System.out.println("Is Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
