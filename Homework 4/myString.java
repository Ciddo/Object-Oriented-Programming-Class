/* 
Cid Dominique
Homework 4

Create your own version of the String class. Call it MyString. This class 
should be immutable. Make sure to encapsulate your data properly. Provide 
an implementation for the following methods:


public MyString(char[] chars);
public char charAt(int index);
public int length();
public MyString substring(int begin, int end);
public MyString toLowerCase();
public MyString toUpperCase();
public boolean equals(MyString s);
public MyString getMyString();
public String toString();	
public static MyString valueOf(int i);


Do not use any function from the String class. The only time you're 
allowed to use the String class is in the toString() method. Even then, 
you may only use the String's constructor, but not the methods.

Make sure to provide a driver class, too, and show the output.
*/

import java.lang.*;


public class myString{
   
   char[] object;

   public myString(char[] chars){
      object = new char[chars.length];
      for (int i=0; i<chars.length ;i++){
         object[i] = chars[i];
      }
   
   }//end constructor
   
   public char charAt(int index){
   
      return object[index];
   }//end charAt
   
   public int length(){
   
      return object.length;
   } //end length
   
   public myString substring(int begin, int end){
      char[] temp;
      temp = new char[end-begin];
      
      for (int i = begin; i<end;i++){
         temp[i] = this.object[i];
      }//end for loop
      myString test = new myString(temp);
      
      return test;
   }//end substring
   
   public myString toLowerCase(){
            for (int i=0; i<object.length ; i++){
         object[i] = Character.toLowerCase(object[i]);
      }
   
      return this;
   }// end toLowerCase
   
   public myString toUpperCase(){
      for (int i=0; i<object.length ; i++){
         object[i] = Character.toUpperCase(object[i]);
      }
   
      return this;
   }//end toUpperCase
   
   public boolean equals(myString s){
         for( int i = 0; i< s.object.length ; i++){
            if(object[i] != s.object[i]){
               return false;
            }//end if
         }//end for loop
   
      return true;
   }// end equals
   
   public myString getMyString(){
   
      return this;
   }//end getMyString
   
   public String toString(){
      String temp = new String(object);
   
      return temp;
   }//end toString	
   
/*   public static myString valueOf(int i){
      myString temp;
      temp.object[0] = object[i];
   
      return temp;
   }//end valueOf       */
   
   public static void main(String[] args){
      
      char[] x= {'5','h','e','l','l','o'};
      myString test = new myString( x );
      System.out.println("Testing length function: " + test.length() );
      test.toUpperCase();
      System.out.println("Testing uppercase :" + test.toString() );
      test.toLowerCase();
      System.out.println("Testing lowerccase :" + test.toString() );   
   
   
   }//end main





}//end class