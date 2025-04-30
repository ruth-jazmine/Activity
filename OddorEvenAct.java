import java.util.Scanner;

public class OddorEvenAct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println( "The number is zero.");
            System.out.println(num + " is an even number.");
        } else {
            if (num > 0) {
                System.out.println(num + " is a postive number.");
            } else {
                System.out.println(num + " is a negative number.");
            }
            if (num % 1 == 0) { 
                if ((int)num % 2 == 0) {
                    System.out.println(num + " is an even number.");
                } else {
                    System.out.println(num + " is an odd number");
                }
            } else {
                System.out.println(num + " is Invalid");
            }
        }
        scanner.close();
    }
} 