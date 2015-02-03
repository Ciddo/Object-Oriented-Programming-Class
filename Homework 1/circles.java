/**
Cid Dominique

Question 8:
Write a program that prompts the user to enter the center coordinates and 
radiuses of two circles. Determine whether the are separate from each 
other, touching each other, overlapping each other, or completely within 
one another. Test each case and show the output.

*/

import java.lang.Math.*;
import java.util.*;

public class circles{
      public static void main(String[] args){
      
         set A = new set();
         set B = new set();
         int radA;
         int radB;
         int AB;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Enter the info for each circle");
         //Get info for circle 1
         System.out.print("Enter the X coordinate of the origin for circle 1:  ");
         A.setx(input.nextInt() );
         System.out.print("Enter the Y coordinate of the origin for cricle 1:  ");
         A.sety(input.nextInt() );
         System.out.print("Enter the radius for this circle:  ");
         radA = input.nextInt();
         //Get info for circle 2
         System.out.print("Enter the X coordinate of the origin for circle 2:  ");
         B.setx(input.nextInt());
         System.out.print("Enter the Y coordinate of the origin for cricle 2:  ");
         B.sety(input.nextInt()); 
         System.out.print("Enter the radius for this circle:  ");
         radB = input.nextInt();     
         
         AB = distance(A,B);
         
         //if Circles are on top of each other
         if ( A.compareTo(B) ){
               System.out.println("These circles are on top of one another.");
         }// end if
         
         //if Circles are Overlapping
         else if ( (AB - radA - radB) < 0 ) {
               System.out.println("These circles are overlapping each other.");
          }//end if
         
         //if Circles are touching
         if ( (AB - radA - radB) == 0 ){
               System.out.println("These circles are touching each other.");
          }//end if
          
          
          //if Circles are separate
          if ( (AB- radA - radB) > 0 ){
               System.out.println("These circles are separate from each other.");
          }//end if
                        
                    
        }//end main
         
      //Distance formula function, returns int value
   public static int distance(set X, set Y){
            return (int) Math.sqrt( Math.pow( (X.getx() - Y.getx()), 2) + Math.pow( (X.gety() - Y.gety()), 2) );
   }//end distance
      
}//end class