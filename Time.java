/* Author: Chao
A program that finds the hours, minutes and seconds in 50,391 seconds
Lecture 2 code */

public class Time
{
   public static void main(String arg[])
   {
     int seconds = 50391, secsInHours = 3600;
     
     int hours = seconds/secsInHours;
     
     System.out.println("Hours :"+ hours);
     
     int remainder = seconds%secsInHours;
     
     int minutes = remainder/60;
       
     System.out.println("Minutes: "+ minutes);
     
     int secs = remainder%60;
     
     System.out.println("Seconds: "+ secs);
     
   }
   
}