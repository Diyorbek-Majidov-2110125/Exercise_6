
//program:     Sort three numbers

package project_1.All;

import java.util.Scanner;

public class Exercise_6_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        displaySortedNumbers(n1, n2, n3);
    }

    public static void displaySortedNumbers(double a, double b, double c){
        double min = Math.min(Math.min(a, b), c);
        double max = Math.max(Math.max(a, b), b);
        double mid = a + b + c - min - max;
        System.out.println("sorted form of numbers: " + min + ", " + mid + ", " + max);
    }
}
