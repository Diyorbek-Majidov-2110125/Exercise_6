
// program: Palindrome integer

package project_1.All;

import java.util.Scanner;

public class Exercise_6_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); int number = input.nextInt();
        System.out.println(number + " is Palindrome? ---> " + isPalindrome(number));
    }
    public static int reverse(int n){
        String number = "" + n;
        String n_str = "";
        for(int i = number.length() - 1; i >= 0; i--){
            n_str += number.charAt(i);
        }
        return  Integer.parseInt(n_str);
    }
    public static boolean isPalindrome(int m){
        if(m == reverse(m))
            return true;
        else
            return false;
    }
}
