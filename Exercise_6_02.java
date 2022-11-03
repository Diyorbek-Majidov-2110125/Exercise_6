// (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer.

package project_1.All;

import java.util.Scanner;

public class Exercise_6_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); long number = input.nextLong();
        int result = sumDigits(number);
        System.out.println("Sum of digits in the number: " + result);
    }
    public static int sumDigits(long n){
        int sum = 0;
        for(int i = 0; i < 18; i++){
            sum += (n / Math.pow(10, i)) % 10;
        }
        return sum;
    }
}
