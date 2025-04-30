import java.util.Scanner;

public class ActOddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("The number is zero.");
            System.out.println("The number is even.");
        } else {
   
            if (num > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is negative.");
            }

            if (num % 1 == 0) { 
                if ((int)num % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
            } else {
                System.out.println("The number is not a whole number, so odd/even check is skipped.");
            }
        }

        scanner.close();
    }
}
