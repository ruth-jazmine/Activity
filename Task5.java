import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1==num2 && num2==num3) {
            System.out.println("All numbers are equal."); 
        } else {
            int largestNum = num1;
            if (num2 > largestNum) {
                largestNum = num2;
            }
            if (num3 > largestNum) {
                largestNum = num3;
            }
            System.out.println("The largest number is: " + largestNum);
        }
        scanner.close();
    }
}