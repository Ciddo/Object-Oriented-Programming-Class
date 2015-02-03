/**
Cid Dominique

Question 5:
Generate a 3 digit lottery number. The program prompts the user to enter a 
3 digit number and determines whether the user wins according to the 
following rules:
1) If the user input matches the lottery number in the exact order, the 
award is $10,000
2) If all the digits in the user input match all the digits in the lottery 
number, the award is $3,000.
3) If one digit in the user input matches a digit in the lottery number, 
the award is $1,000.
Test all three cases & show the output.

*/
import java.lang.Math.*;
import java.util.*;


public class lottery{
   public static void main(String[] args){
         
      int match1 = (int) (Math.random()*9 + 1);
      int match2 = (int) (Math.random()*9 + 1);
      int match3 = (int) (Math.random()*9 + 1);
      Scanner input = new Scanner(System.in);
      String compare = new String();
      String user1 = new String();
      String user2 = new String();      
      String user3 = new String();
      String total = new String();
      int guess1;
      int guess2;
      int guess3;   
      
      compare = Integer.toString(match1)+ Integer.toString(match2)+ Integer.toString(match3);       
    //  System.out.println(compare);  // Testing Lottery Number
      
      //Get Inputs
      System.out.println("Guess the 3 digit lottery number!");
      do{
         System.out.println("Enter the First digit");
         guess1 = input.nextInt();
         System.out.println("Enter the Second digit");
         guess2 = input.nextInt();
         System.out.println("Enter the Third digit");
         guess3 = input.nextInt();
         
         //Test each digit for range 0-10
         if ( ( (guess1<0) || (guess1>=10) ) || ( (guess2<0) || (guess2>=10) ) || ( (guess3<0) || (guess3>=10) ) ){
            System.out.println("One or more of your values are not valid. Try again!");
         }//end else
               
      }while(  ( (guess1<0) || (guess1>=10) ) || ( (guess2<0) || (guess2>=10) ) || ( (guess3<0) || (guess3>=10) ) );
      
      
      //Convert all integers into strings
    //  compare = Integer.toString(match1)+ Integer.toString(match2)+ Integer.toString(match3);
      user1 = Integer.toString(guess1);
      user2 = Integer.toString(guess2);      
      user3 = Integer.toString(guess3);
      total = user1+user2+user3;
      
      System.out.println("Your number is: "+ total); 
      
      // Checks first case      
      if ( compare.equals(total) ){ 
         System.out.println("You won $10,000!!!!!");
      }//end if
      
      else {
      
         // Checks second case
         if( compare.contains(user1) && compare.contains(user2) && compare.contains(user3) && !( ( user1.equals(user2) && user2.equals(user3) ) ) ){
            System.out.println("You won $3,000!!!");
         }//end if
         
         //Checks third case
         else if ( compare.contains(user1) ){
            System.out.println("You won $1,000!!!");
         }//end else if
         
         else if ( compare.contains(user2) ){
            System.out.println("You won $1,000!!!");
         }//end else if         
         
         else if ( compare.contains(user3) ){
            System.out.println("You won $1,000!!!");
         }//end else if         
         
         
         else{
            System.out.println("Sorry you didn't win....");
         }// end else
            
         
     }//end else
                          
      
   }//end method
}//end class
         

