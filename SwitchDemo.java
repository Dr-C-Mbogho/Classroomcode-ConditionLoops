import java.util.Scanner;

public class SwitchDemo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter number of ice cream flavors:");    
    int numberOfFlavors = keyboard.nextInt( );
   
  
    switch (numberOfFlavors + 1)
    {
        case 1:
        System.out.println("Apples");
        break ;
        
        case 2:
        System.out.println("Oranges");
        break ;
        
        case 3:
        System.out.println("Peaches");
        case 4:
            
        System.out.println("Plums");
        break ;
        
        default :
        System.out.println("Fruitless");
    } 
          
  }
}