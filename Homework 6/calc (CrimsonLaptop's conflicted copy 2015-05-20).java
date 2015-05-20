/* Cid Dominique
Homework 6

Write a command line calculator. Implement the +, -, /, *, and % 
functions. Make sure your calculator works with both integers and doubles. 
Here's an example run:

javac Calculator 2 + 3
5

Separate all the arguments with a space to make your life easy.

If the user enters anything other than a number where a number belongs, 
throw a NotANumberException derived from the IlleglArgumentException. If 
the user enters an operation which isn't supported, throw a 
IllegalOperationException derived from the IllegalArgumentException. If 
the user forgets to enter a number, throw a NotEnoughNumbersException also 
derived from IllegalArgumentException. Make sure you deal with these 
exceptions gracefully. Don't pass them on to the JVM. Here are some 
examples:

javac Calculator y + 7	//should throw a NotANumberException and ask the 
user to re-enter the number.

javac Calculator 7 # 7	//should throw a IllegalOperationException and ask 
the user for the correct function.

javac Calculator 7 +	//should throw a NotEnoughNumbersException and ask 
the user for the second number.

You should also catch and deal with ArithmeticException in case the user 
tries to divide by zero.

Once you get a basic calculator going, Try to make it so that even a long 
expression works. Eg,

javac Calculator 2 + 3 - 7 * 9 / 3 + 11
*/

import java.util.*;

public class calc{

   public static void main(String args[]){
   
   int []num = new int[args.length];
      
   for (int i = 0; i< num.length; i++){
      int j=i;
      if (j%2 == 0){
         num[i] = Integer.parseInt(args[j]);
      }
         
   }
   
   
   }//end main
   
}//end class.