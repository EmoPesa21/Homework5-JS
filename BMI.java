import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double Height = 0;
        double Weight = 0;
        System.out.println("Enter your height: ");
        Scanner scanner = new Scanner(System.in);
            Height = scanner.nextDouble();
        System.out.println("Enter your weight: ");
            Weight = scanner.nextDouble();

            double BMI = Weight/(Math.pow(Height,2));
            boolean NormalWeight = 18 <= BMI && BMI <= 24.9;
            boolean UnderWeight = 18 > BMI;
            boolean OverWeight = 24.9 < BMI;

            if (NormalWeight){
                System.out.println("Fit");
            } else {
                System.out.println("Not Fit");
            }
            if (UnderWeight){
                System.out.println("Slim");
            } else {
                System.out.println("Not Slim");
            }
            if (OverWeight){
                System.out.println("Fat");
            } else {
                System.out.println("Not fat");
            }
    }
}

