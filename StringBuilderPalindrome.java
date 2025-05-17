import java.util.Scanner;

public class StringBuilderPalindrome {

public static void main(String[] args) {
    Scanner wordInput = new Scanner(System.in);
    System.out.print("Enter a Word:");
    String wordStringChecker =wordInput.nextLine();
    StringBuilder sb = new StringBuilder(wordStringChecker);
    String wordStringRev = sb.reverse().toString();

    if(wordStringChecker.equals(wordStringRev)){
        System.out.println(wordStringChecker +" : The input string is a palindrome.");
        }else{
            System.out.println(wordStringChecker + "The input string is not a palindrome.");
    }
    wordInput.close();
}
}