import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        double Num = 0;

        System.out.println("Enter your number: ");

        Scanner scanner = new Scanner(System.in);
        Num = scanner.nextDouble();
        boolean Equation = Num % 2 == 0;

        if (Equation){
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    }
}
