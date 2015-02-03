/**
Cid Dominique

Question 9:
Write a program that plays a number guessing game with the user. Give 
hints to whether the secret number is higher or lower than the user's 
guess. When the user finally gets it right, print "Horay!"
*/

import java.lang.Math.*;
import java.util.*;

public class guessing{
      public static void main(String[] args){
      
      int num = (int) (Math.random() * 999) + 1;
      int guess;
      Scanner input = new Scanner(System.in);
      // System.out.println(num);
      
      do{
         System.out.print("Guess a number between 1 and 1000!:  ");
         guess = input.nextInt();
         if (guess < num){
               System.out.println("Guess with a Higher number!");
         }// end if
         if (guess > num){
            System.out.println("Guess with a lower number!");
         }//end if
         if (guess == num){
            System.out.println("Horay!");
         }//end if
         
      }while ( !(guess==num) );
         
      
      
      }//end main
}//end class