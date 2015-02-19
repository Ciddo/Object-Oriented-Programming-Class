/**
Cid Dominique

Question 2:
Write a program that displays a calendar on the screen. It asks the user 
the year, what day the first of January fell on, then displays every month 
from January to December. Make sure to get the leap years right. Your 
months should resemble the following format:

   February 2015      
Su Mo Tu We Th Fr Sa  
 1  2  3  4  5  6  7  
 8  9 10 11 12 13 14  
15 16 17 18 19 20 21  
22 23 24 25 26 27 28 
*/

import java.util.*;

public class calendar{
      
  // public int day = 1;
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      int year,day, space;
      int month_31 = 31;
      int month_30 = 30;
      int feb_leap = 29;
      int feb = 28;
      int total = 365;
      int total_leap = 366;
      
      
      
      String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
      String week = ("Su Mo Tu We Th Fr Sa");
      
      System.out.println("Please enter the year you wish to print for this calendar: ");
      year = input.nextInt();
      System.out.println("Please enter the day that the first of January fell on: ");
      System.out.println("Use values 1-7 (1 = Sunday, 7 = Saturday)");
      //while (!day < 1 && !day > 7){
      day = input.nextInt();
      space = (day-1)*3 + 1;
      
      for( int i = 0; i <= 11 ; i++){ 
      
         System.out.println(month[i]+" "+year);
         System.out.println(week);
         spaces(space);
         
         if (i == 1-1 ){
        
            for (int j = 1; j<=month_31;j++){
               if (i<9){               
                  System.out.print(j);
                  spaces(2);
                  space = space+2;
               }
               else {
                  System.out.print(j);
                  spaces(1);
                  space = space+2;               
               }
               if (space > 13){
                  System.out.println();
                  space = 1;
                  if(i<9){
                     spaces(space);
                  }

               }
               
            }// end for loop
          System.out.println();  
         }//end if
         
         if ( i == 4-1 || i == 6-1 || i == 9-1 || i == 11-1 ){
              
              for (int j = 1; j<= month_30; j++){
                     spaces(2);
                     System.out.print(j);   
              }  
         System.out.println();           
         }
         
        if ( i == 3-1 || i == 5-1 || i == 7-1 || i == 8-1 || i == 10-1 || i == 10-1 || i ==12-1 ){
             
             for (int j = 1; j<= month_31; j++){
                    spaces(2);
                    System.out.print(j);   
             }  
        System.out.println();           
        }
         
      
      }//end i loop       
   
   
   }//end main
   
   //Handles the spacing for the day of the week
   static void spaces(int x){
   
      for(int j = x; j>0 ; j--){
         System.out.print(" ");
      }//end for loop
      
   }// end spaces
   
   
}// end class