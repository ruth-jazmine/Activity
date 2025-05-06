import java.util.Scanner;

public class StringBuilderPalindrome {

public static void main(String[] args) {
    Scanner wordInput = new Scanner(System.in);
    System.out.print("Enter a Word:");
    String wordStringChecker =wordInput.nextLine();
    String wordStringRev = "";
    for(int i = wordStringChecker.length()-1; i >=0; i--){
        wordStringRev+= wordStringChecker.charAt(i);
    }
    if(wordStringChecker.equalsIgnoreCase(wordStringRev)){
        System.out.println(wordStringChecker +" is a palindrome.");
        }else{
            System.out.println(wordStringChecker + " is not a palindrome.");
    }
    wordInput.close();
}
}