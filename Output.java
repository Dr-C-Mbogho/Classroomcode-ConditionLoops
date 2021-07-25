/*
 Code for slide 35, lecture 1
*/

public class Output
{
  public static void main(String arg[])
  {
     int x=10;
     String name = "Jane";
     int y = x*2+2; //get 22
     int z = x%3; //get 1
     
     System.out.println("My name is " + name);
     System.out.println("I like the number " + x);
     
     //using print to output on the same line
     System.out.print("Sometimes I think about the number " + y);
     System.out.print(".But I know I am number" + z);
  }

}