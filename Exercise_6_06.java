
//program: Display patterns
package project_1.All;

import java.util.Scanner;

public class Exercise_6_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        displayPattern(number);
    }


    public static void displayPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("   ");
            }

            for(int a = n - i + 1; a > 0; a--){
                System.out.printf("%-3d", a);
            }
            System.out.println();
        }
    }
}
