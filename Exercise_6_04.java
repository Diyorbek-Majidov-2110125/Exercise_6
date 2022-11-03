
// program: Display an integer reversed

package project_1.All;


import java.util.Scanner;

public class Exercise_6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); int m = input.nextInt();
        System.out.print("reversal of " + m + " is ");
        reverse(m);
    }


    public static void reverse(int number){
        String num = "" + number;
        String n_str = "";
        for(int i = num.length() - 1; i >= 0; i--){
            n_str += num.charAt(i);
        }
        System.out.println(Integer.parseInt(n_str));
    }
}
