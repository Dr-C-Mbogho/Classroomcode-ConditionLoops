/* Author: Chao
Write a program that calculates the sum of all 
numbers from 10 to 200 using a for-loop
Lecture 2 code */

public class ForLoopSum
{
   public static void main(String arg[])
   {
      int sum = 0;
      
      for(int i=10; i<=200; i++)
      {
        sum = sum+i;
      }
      
      System.out.printf("Sum: " + sum);
   }
 }