
/* program: Write a test program that prompts the user to enter a positive double value and
displays its square root   */


package project_1.All;

import java.util.Scanner;

public class Exercise_6_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number: "); double number = input.nextDouble();
        System.out.printf("The root of %f: %f", number, sqrt(number));
    }

    public static double sqrt(double n){
        double lastGuess = 1;
        double nextGuess = 0;
        boolean iscontinue = true;
        do {
            nextGuess = (lastGuess + n/lastGuess)/2;
            if(Math.abs(nextGuess - lastGuess) <= 0.0001)
                iscontinue = false;
            else
                lastGuess = nextGuess;
        } while (iscontinue);
        return nextGuess;
    }
}
