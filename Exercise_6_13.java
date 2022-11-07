
//program: (Sum series) Write a method to compute the following summation:


package project_1.All;

import java.util.Scanner;

public class Exercise_6_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); int n = input.nextInt();
        m(n);
    }

    public static void m(int n){
        double sum = 0;
        System.out.println("i               m()");
        for(int i = 1; i <= n; i++){
            sum = sum + (float)i/(i + 1);
            System.out.printf("%d%23f", i, sum);
            System.out.println();

        }
    }
}
