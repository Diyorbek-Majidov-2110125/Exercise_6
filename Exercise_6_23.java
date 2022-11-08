package project_1.All;

import java.util.Scanner;

public class Exercise_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string and character: ");
        String str = input.nextLine();
        char ch = input.next().charAt(0);
        System.out.printf("Number of occurrences of %ch character in %s: %d", ch, str, count(str, ch));
    }

    public static int count(String str, char a){
        int countOfLetter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a)
                countOfLetter++;
        }
        return countOfLetter;
    }
}
