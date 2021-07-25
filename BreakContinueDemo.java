public class BreakContinueDemo
{
  public static void main(String arg[])
  {
    int countdown = 4;
    int i = 1,j=1;
    
   System.out.println("Demo Continue");
   
    while(countdown>0)
    {
       System.out.println("Hello " + i);
       countdown--;
         if(countdown==2)
            continue; //the next line will not be processed when this is executed
       i++;  
    } 
   
    System.out.println("\nDemo Break"); 

    int countdo = 3;
    
    do    
    {
       System.out.println("Hello do " + j);
       countdo--;
         if(countdo==2)
           break; //ends the loop when this is processed
       j++;  
    }while(countdo>0);
  }
  
}