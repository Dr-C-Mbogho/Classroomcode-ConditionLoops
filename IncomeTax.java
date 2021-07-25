/*Note use of AND operator &&
   */

import java.util.Scanner;

public class IncomeTax
{
 public static void main(String[] args)
 {
   Scanner keyboard = new Scanner(System.in);
   double netIncome, tax, fivePercentTax, tenPercentTax;
   System.out.println("Enter net income.\n Do not include ksh sign or any commas.");
   
   netIncome = keyboard.nextDouble( );
   if (netIncome <= 30000)
         tax = 0;
   else if ((netIncome > 30000) && (netIncome <= 50000))
         tax = (0.01*(netIncome - 30000));
   else //netIncome > ksh50,000
   {
      //fivePercentTax = 5% of income from ksh50,000 to ksh100,000.
     fivePercentTax = 0.05*50000;
     //tenPercentTax = 10% of income over 100,000.
     tenPercentTax = 0.10*(netIncome - 100000);
     tax = (fivePercentTax + tenPercentTax);
   }
     System.out.printf("Tax due = ksh%.2f", tax);
  }
}