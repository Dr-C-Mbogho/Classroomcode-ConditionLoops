public class WhileDoDemo
{
  public static void main(String arg[])
  {
    int countdown = 4;
    int i = 1,j=1;
    
    while(countdown>0)
    {
       System.out.println("Hello while " + i);
       countdown--;
       i++;  
    } 
    
    int countdo = 2;
    
     do
    {
       System.out.println("Hello do " + j);
       countdo--;
       j++;  
    }while(countdo>0);
  }
  
}
     