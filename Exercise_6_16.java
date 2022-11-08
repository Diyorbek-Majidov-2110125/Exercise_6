package project_1.All;

import java.util.Scanner;

public class Exercise_6_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter years: ");
        int first_year = input.nextInt();
        int second_year = input.nextInt();
        System.out.println("Days between " + first_year + " and " + second_year +": " + numberOfDaysInAYear(first_year, second_year));
    }
    public static int numberOfDaysInAYear(int first_year, int second_year){
        int numberOfDays = 0;
        for(int i = (int)Math.min(first_year, second_year); i <=(int)Math.max(first_year, second_year); i++){
            if((i % 4 == 0 && i % 100 ==0) || i % 400 == 0)
                numberOfDays  += 365;
            else
                numberOfDays += 366;
        }
        return numberOfDays;
    }
}
