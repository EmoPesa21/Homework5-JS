import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
            int X = 0;
            int Y = 0;
            int Z = 0;
            System.out.println("Enter 3 digits: ");
            Scanner scanner = new Scanner(System.in);
            X = scanner.nextInt();
            Y = scanner.nextInt();
            Z = scanner.nextInt();

            boolean isEqualTo = ((X == Y) && (Y == Z));
            boolean isItWithEqualSides = ((X == Y) && (X != Z));

            if (isEqualTo){
                System.out.println("Equilateral");
            } else if (isItWithEqualSides) {
                System.out.println("Isoscale");
            } else {
                System.out.println("Scalene");
            }


    }
}
