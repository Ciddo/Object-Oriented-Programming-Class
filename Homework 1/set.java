/**
Cid Dominique
Creating Coordinate Object for triangle and circles classes

*/
import java.lang.Math.*;
import java.util.*;

public class set{
   int x;
   int y;   

   //Constructors
   public void set(){
      x =0;
      y =0;
   }// end constructor
   public void set(int a,int b){
      x = a;
      y = b;
   }// end constructor
   
   public void setx(int a){
      x = a;
   }// end set x
   
   public void sety(int b){
      y = b;
   }// end set y
   
   public int getx(){
      return x;
   }//end get x
   
   public int gety(){
      return y;
   }// end get y
   
   public boolean compareTo(set next){
      if ( x == next.getx() && y == next.gety() ){
         return true;  
      }
      else 
         return false;          
   } // end compareTo 
   
   public String toString(){
     return ("( "+ x + "," + y + ")" );
   }// end toString




}//end class