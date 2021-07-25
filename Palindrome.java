/* Author: Chao
A program that accepts user input of a 5-digit number and determines if a number is a Palindrome.
A palindrome is a number that can be read the same forwards and backwards e.g. 11011 
Lecture 3 code */

import java.util.Scanner;

public class Palindrome
{
  public static void main(String arg[])
  {
     Scanner input  = new Scanner(System.in);
     
     System.out.println("Enter a five digit number");
     
     int number = input.nextInt();
     int temp = number;
     int reverse = 0;
     
     //Determine if number is 5-digits long     
     //Convert the digit to a string and find the length
     //Use toString() method to convert integer to String
     int check = Integer.toString(number).length();
     
     if(check==5)
     {
        do
         {
           int value = number%10;
           reverse = reverse*10+value;
           number = number/10; 
         }while(number>0); 
         
      
      if(reverse==temp)
         System.out.println(temp + " is a palindrome");   
       
     }    
     else
        System.out.println("Your number is not a 5-digit value");
  
  }


}