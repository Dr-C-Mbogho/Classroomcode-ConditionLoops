import java.util.Scanner;

public class InputDemo
{
   public static void main(String arg[])
   {
      //Create an object of the Scanner class
      Scanner input = new Scanner(System.in);
      
      System.out.println ("Type a sentence");
      
      //nextLine() reads a line of text
      String typed = input.nextLine();
      
      System.out.print("You typed: " + typed);
   }
 }
