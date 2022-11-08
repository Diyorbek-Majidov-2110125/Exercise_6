
/*program:(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix
using the following header:  */


package project_1.All;

import java.util.Scanner;

public class Exercise_6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n(n - row and column): "); int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((int)(Math.random() * 2) + "  ");
            }
            System.out.println();
        }
    }
}
