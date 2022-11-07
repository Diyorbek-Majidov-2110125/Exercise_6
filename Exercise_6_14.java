
//program: (Estimate p) p can be computed using the following summation:

package project_1.All;

import java.util.Scanner;

public class Exercise_6_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); int n = input.nextInt();
        System.out.println("i                    PI");
        pi(n);
    }

    public static void pi(int n){
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + 4 * (Math.pow(-1, i + 1)/(2 * i - 1));
            if(i % 100 == 1){
                System.out.printf("%-3d%26f", i, sum);
                System.out.println();
            }

        }
    }
}
