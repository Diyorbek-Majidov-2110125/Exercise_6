
/* program: Write a test program that prompts the user to enter a phone number as a string.
The input number may contain letters. The program translates a letter (uppercase
or lowercase) to a digit and leaves all other characters intact. Here are sample
runs of the program */


package project_1.All;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String number = input.nextLine();
        char[] num = number.toCharArray();

        for(int i = 0; i < num.length; i++){
            num[i] = getNumber(num[i]);
            }
        System.out.println(num);
        }

    public static char getNumber(char uppercaseLetter){
        char number = uppercaseLetter;
        if(Character.isLetter(uppercaseLetter)){
            char a = Character.toLowerCase(uppercaseLetter);
            if(a ==  'a' || a == 'b' || a == 'c')
                number = '2';
            else if(a ==  'd' || a == 'e' || a == 'f')
                number = '3';
            else if(a ==  'g' || a == 'h' || a == 'i')
                number = '4';
            else if(a ==  'j' || a == 'k' || a == 'l')
                number = '5';
            else if(a ==  'm' || a == 'n' || a == 'o')
                number = '6';
            else if(a ==  'p' || a == 'q' || a == 'r' || a == 's')
                number = '7';
            else if(a ==  't' || a == 'u' || a == 'v')
                number = '8';
            else if(a ==  'w' || a == 'x' || a == 'y' || a == 'z')
                number = '9';
        }
        else
            number = uppercaseLetter;
        return number;
    }
}
