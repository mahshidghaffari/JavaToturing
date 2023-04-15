//https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;
public class control {
    public static void main(String[] args) {

        Scanner myScaner = new Scanner(System.in);  // Create the scanner
        System.out.println("enter your name : ");
        String text = myScaner.nextLine();     // Get the text in scanner till next line
//        String text = myScaner.next();     // Get the text in scanner till next word
        System.out.println("hi "+ text);



    }


}