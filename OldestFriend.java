/* Author: Chao
Write a program that accepts the ages of your 3 
friends in a for-loop and calculates who is the oldest.
Lecture 2 code */

import java.util.Scanner;

public class OldestFriend
{
   public static void main(String arg[])
   {
      Scanner input = new Scanner(System.in);
      int sum = 0, oldest=0, age;
      
      //use a for-loop to accept the ages of 3 friends
      for(int i = 1; i<=3; i++)
      {
         System.out.println ("Enter age " + i + " as an integer");
         age = input.nextInt(); 
         
         /*compare if entered age is greater than previous oldest age
         */
         if(age>oldest)
           oldest = age;
      }
            
      System.out.printf("Oldest age " + oldest);
   }
 }