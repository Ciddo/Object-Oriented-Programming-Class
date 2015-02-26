import java.util.*;

public class Chessboard{
      public static void main(String[] args){
      
       //Creating 8x8 board and filling it with #s
       char[][] board;
       board = new char[8][8];
       
       for ( int i = 0; i< board.length; i++){
         for (int j = 0; j< board.length; j++){
            board[i][j] = '#';       
         }//end j loop
       }// end i loop
       
       //Creating queens object array and check if all coordinates are good
       Queens[] object;
       object = new Queens[8];
       for(int i=0; i< object.length ; i++){
         object[i] = new Queens();
       }
       
       for ( int i = 0; i < object.length; i++){
         for ( int j = 0; j < object.length; j++){
            
            if ( i != j){
                                   
               if ( object[i].check( object[j] ) ){
                  object[i].change();
                  i = 0;
                  break;

               }//end inner if
               
            }//end outer if
      
         }// end j loop
         
       }//end i loop
       
       // replacing correct queens coordinates with Qs in board
       for (int i = 0; i < object.length; i++) {
         int x = object[i].getX() - 1;
         int y = object[i].getY() - 1;
         board[ x ][ y ] = 'Q';   
       }// end i loop  
       
        
       //Print out full checkerboard
       for (int i = 0; i<board.length ; i++){
         for(int j = 0; j<board.length ; j++){
            System.out.print(board[i][j]+" ");
          }// end j loop
          System.out.println();
        }// end i loop  
      
      
      } // end main
}// end class