/**
Cid Dominique

Question 3:
Write a program that reads in investment amount, annual interest rate, and 
the number of years and displays the future investment value using the 
following formula:
invest_value = invest_amount * (1 + monthly_interest_rate)^(num_years*12)
Show the output.
*/
import java.lang.Math.*;
import java.util.*;

public class investment{
   public static void main(String[] args){
      double rate, years, principle;   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the principle:     ");
      principle = input.nextDouble();
      System.out.println();
      
      System.out.print("Enter the annual interest rate:     ");
      rate = input.nextDouble()/100;
      System.out.println();
      
      System.out.print("Enter the amount of years:     ");
      years = input.nextDouble();
      System.out.println();
      
      System.out.print("Future invement value = ");
      System.out.printf("%.2f", principle * Math.pow( 1+(rate/12) , (years*12)  ) );   
      
   
   }//end method
}//end class
