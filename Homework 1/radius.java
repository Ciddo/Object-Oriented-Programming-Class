/**
Cid Dominique

Question 1
In a loop, read radiuses from a user. Calculate the area of a circle using 
the formula PI*r^2. Use the pow function, and the PI constant in the Math 
class. Pick your data types wisely. Exit when the user presses ^d. Show 
your output.

*/
import java.lang.Math.*;
import java.util.*;



public class radius {
   public static void main(String[] args){
      double r;
      Scanner input = new Scanner(System.in);
      
      do{
         System.out.println("Enter a value for the radius: ");
         r = input.nextDouble();
         
         if(r>=0){            // Makes sure radius is positive
            System.out.print("The area of this circle is: ");
            System.out.printf("%.2f", Math.pow(r,2)*Math.PI );
            System.out.println();
         }//end if
         
         else{
            System.out.println("Radius must be a positive value! Try again!");
         }//end else
         
         
      }while(input.hasNextDouble()); //end do while loop
      
      
   }//end method
   
}//end class   