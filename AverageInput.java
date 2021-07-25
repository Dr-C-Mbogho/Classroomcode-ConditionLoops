/* Author: Chao
Write a program that accepts two integer values 
from the user, sums them up, and finds the average 
value. 
Lecture 2 code */

import java.util.Scanner;

public class AverageInput
{
   public static void main(String arg[])
   {
      Scanner input = new Scanner(System.in);
      int sum = 0;
      
      System.out.println ("Enter the first integer");
      
      int num1 = input.nextInt();
      sum = sum + num1;
      
      System.out.println ("Enter the second integer");
      
      int num2 = input.nextInt();
      sum = sum + num2;
      
      int average = sum/2; 
      
      System.out.printf("Average: " + average);
   }
 }