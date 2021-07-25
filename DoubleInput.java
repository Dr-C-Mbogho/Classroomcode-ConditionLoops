/* Author: Chao
A program that accepts two decimal values from the user
and calculates the sum.
Lecture 2 code */

import java.util.Scanner;

public class DoubleInput
{
   public static void main(String arg[])
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println ("Enter the first value");
      
      double num1 = input.nextDouble();
      
      System.out.println ("Enter the second value");
      
      double num2 = input.nextDouble();
      
      double sum = num1 + num2;      
      
      System.out.printf("Sum is %.1f", sum);
   }
 }