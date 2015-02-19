/**
Cid Dominique

Question 1:
Write a program that asks the user how tall of a pyramid do they want to 
display on the screen, and then displays the pyramid that counts up on the 
left, and counts down on the right. For eg, if the user enters 4, the 
program shows:

        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
*/

import java.util.*;

public class pyramid{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      int num =0;
      String format = new String("%");
      
      System.out.println("How tall of a pyramid do you want displayed?");
      num = input.nextInt();
      
      
      for (int i = 1; i<=num  ; i++){
            
            //loop handles spaces in front of numbers         
            for (int j = num; j >= i; j--){
                     System.out.print("  ");                     
            }// end j loop  
            
            //handles printing the ascending numbers            
            for (int j = 1; j <= i ;j++){                  
                  System.out.print(j+" ");
            }//end j loop 
            
            //handles printing the decending numbers
            for (int j = i-1; j>= 1; j--){
                  System.out.print(j+" ");
            }// end j loop
            
            System.out.println();
               
              
      }//end i loop
      
      
   
   }// end main
}// end pyramid class