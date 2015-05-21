/* Cid Dominique
Homework 9

Write a Java program that tries to make a connection with a database and 
pull records from a table. Keep it simple. Just do a 'select * from 
table_name'. This assignment is mainly getting the program to connect with 
a database, not fancy SQL queries.

*/

import java.sql.*;

public class Database {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try{
            Class.forName("com.mysql.jdbc.Driver");
   
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);
   

            while(rs.next()){

               int id  = rs.getInt("id");
               int age = rs.getInt("age");
               String first = rs.getString("first");
               String last = rs.getString("last");
   
               System.out.print("ID: " + id);
               System.out.print(", Age: " + age);
               System.out.print(", First: " + first);
               System.out.println(", Last: " + last);
            
        }
     }
      catch(SQLException ex){
          System.out.println("Error with Database");
      }
      catch(ClassNotFoundException cx){
          System.out.println("Error with Database");
      }      
   }  
}     