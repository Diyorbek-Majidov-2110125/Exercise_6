/*Write a test program that reads three sides for a triangle and uses the isValid
method to test if the input is valid and uses the area method to obtain the area.
The program displays the area if the input is valid. Otherwise, it displays that
the input is invalid  */


package project_1.All;

import java.util.Scanner;

public class Exercise_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(area(a, b, c) == 0.0)
            System.out.println("inputs are invalid");
        else
            System.out.println("Area of triangle: " + area(a, b, c));

    }
    public static boolean isValid(double side1, double side2, double side3){
        boolean is_valid = false;
        if(side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1)
            is_valid = true;
        return  is_valid;
    }
    public static double area(double side1, double side2, double side3){
        double area = 0;
        if(isValid(side1, side2, side3)){
            double p = (side1 + side2 + side3)/2;
            area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }
        return  area;
    }

}
