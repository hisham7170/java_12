package day09;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character ");
        char ch = input.next().charAt(0);

        System.out.println("Wolde like to continue?");
        String answer = input.next();


        System.out.println("you have entered " + ch);
        System.out.println("answer " + answer);


        input.close();


    }
}
