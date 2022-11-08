
//program: Count the letters in a string

package project_1.All;

import java.util.Scanner;

public class Exercise_6_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: "); String word = input.nextLine();
        System.out.printf("The number of letter in %s: %d",word,countLetters(word));
    }


    public static int countLetters(String s){
        int countOfletters = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))
                countOfletters++;
        }
        return countOfletters;
    }
}
