package project_1.All;

import java.util.Scanner;

public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password(at least 8 characters consist of letters and at least 2 digits): " );
        String password = input.nextLine();
        System.out.printf("%s password is acceptable? ---> %b",password, isPassword(password));
    }

    public static boolean isPassword(String str){
        boolean is_password = false;
        int countOfdigits = 0;
        int countOfletters = 0;
        if(str.length() >= 8){
            for(int i = 0; i < str.length(); i++){
                char a = str.charAt(i);
                if(Character.isDigit(a))
                    countOfdigits++;
                if(Character.isLetter(a))
                    countOfletters++;
            }
            if(str.length() == countOfdigits + countOfletters && countOfdigits > 1)
                is_password = true;
        }
        return  is_password;
    }
}
