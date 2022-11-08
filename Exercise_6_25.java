package project_1.All;

import java.util.Scanner;

public class Exercise_6_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number in milli seconds: ");
        long milliseconds = input.nextLong();
        System.out.println("time: " + convertMillis(milliseconds));
    }


    public static String convertMillis(long millis){
        long seconds = millis / 1000 % 60;
        long minutes = millis / 60000 % 60;
        long hours = millis / 3600000;
        String str = "" + hours + ":" + minutes + ":" + seconds;
        return str;
    }
}
