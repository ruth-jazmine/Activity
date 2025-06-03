import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b); 
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("1st number: ");
        int a = scanner.nextInt();

        System.out.print("2nd number: ");
        int b = scanner.nextInt();

        System.out.println("\nResults:");
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    } finally {
        scanner.close();
    }
}

}
