/**
Cid Dominique

Question 7:
Write a program that reads three 2D points A, B, and C from the user. 
Next, calculate the length of each side of the triangle using the 
distance formula: sqrt((x2-x1)^2+(y2-y1)^2). Finally, determine if it's a 
real triangle. For a triangle to be real, the sum of any two sides needs 
to be greater than the third. Make sure your output has some real and at 
least one fake triangle.
*/

import java.lang.Math.*;
import java.util.*;

public class triangle{
      public static void main(String[] args){
      
         //Created set object to handle coordinates
         set A = new set();
         set B = new set();
         set C = new set();
         Scanner input = new Scanner(System.in);
         
         //Line Segments      
         int AB;
         int BC;
         int AC;
      
      
         System.out.println("Enter the coordinates of your triangle");
         
         //Collect Coordinates for A
         System.out.print("Enter X coordinate for first point:  ");
         A.setx(input.nextInt());
         System.out.print("Enter Y coordinate for first point:  ");
         A.sety(input.nextInt());
         
         //Collect Coordinates for B
         System.out.print("Enter X coordinate for second point:  ");
         B.setx(input.nextInt());
         System.out.print("Enter Y coordinate for second point:  ");
         B.sety(input.nextInt());
         
         //Collect Coordinates for C
         System.out.print("Enter X coordinate for third point:  ");
         C.setx(input.nextInt());
         System.out.print("Enter Y coordinate for third point:  ");
         C.sety(input.nextInt());
         
         //Calculate Line segments
         AB = distance(A,B);
         AC = distance(A,C);
         BC = distance(B,C);
         
         //Checking if triangle is valid
         if ( (AB+AC > BC) && (AB+BC > AC) && (AC+BC > AB) ){
            System.out.println("This is a valid triangle!!!");
         }//end if
         
         else
          System.out.println("This is not a valid triangle");           
         
         
      
           
      }//end main
      
      //Distance formula function, returns int value
      public static int distance(set X, set Y){
            return (int) Math.sqrt( Math.pow( (X.getx() - Y.getx()), 2) + Math.pow( (X.gety() - Y.gety()), 2) );
      }//end distance
      
}//end class