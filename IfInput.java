/* Author: Chao
Write a program that accepts two integer values 
from the user, sums them up, and finds the average 
value. Accept only values larger than 10
Lecture 2 code */

import java.util.Scanner;

public class IfInput
{
   public static void main(String arg[])
   {
      Scanner input = new Scanner(System.in);
      int sum = 0;
      
      System.out.println ("Enter the first integer larger than 10");
      int num1 = input.nextInt();
      
      if(num1<=10)
      {
        System.out.println("Value has to be larger than 10. Value will be assigned to 11");
        num1 = 11;
        sum = sum + num1;
      }
      else
        sum = sum + num1;
      
      
      System.out.println ("Enter the second integer");
      int num2 = input.nextInt();
      
       if(num2<=10)
      {
        System.out.println("Value has to be larger than 10. Value will be assigned to 11");
        num2 = 11;
        sum = sum + num2;
      }
      else
        sum = sum + num2;
      
      int average = sum/2; 
      
      System.out.printf("Average: " + average);
   }
 }