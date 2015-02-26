import java.util.*;

public class Queens{
      
      int x,y;
      
      public Queens(){
         x = (int)( Math.random() * 8) +1;
         y = (int)( Math.random() * 8) +1;
      }// end constructor
      
      public int getX(){
         return x;
      }
      
      public int getY(){
         return y;
      }
      
      //Changes the coordinates randomly
      public void change(){
         x = (int)( Math.random() * 8) +1;
         y = (int)( Math.random() * 8) +1;
      }// end change
      
      //checks if queens can attack each other
      public boolean check(Queens other){
      
         // checks x coordinates are equal
         if(x == other.getX() ){
            return true;
            
         }// end if
         
         //checks if y coordinates are equal
         if (y == other.getY() ){
            return true;
            
         }// end else if
         
         // checks if the difference between x and y coordinates for both points
         // are equal for both diagonals
         if ( Math.abs( x - other.getX() ) == Math.abs( y - other.getY() ) ) {
            return true;
              
         }// end else if
         
         else
            return false;
         
      
      
      }//end check
      
      public static void main(String[] args){
         Queens test = new Queens();
         System.out.println(test.getX());
         System.out.println(test.getY());
         for (int i = 1; i<=5; i++){
             test.change();
             System.out.println();
             System.out.println(test.getX());
             System.out.println(test.getY());
         }
         
      }//end main
      
      
}// end class