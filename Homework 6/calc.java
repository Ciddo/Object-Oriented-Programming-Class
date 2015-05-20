/*
Cid Dominique
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
public class calc
{
        public static void main (String[] args) {
                Scanner input = new Scanner(System.in);
                String[] line = args;
                double result = 0;
                boolean isValid = true;

                do {
                        try {
                           for(int i=0;i<line.length;i++){
                           
                                if (line[i].equals("+")) {
                                        result = Integer.parseInt(line[i+1]) + Integer.parseInt(line[i-1]);
                                    System.out.print(result);
                                }
                                else if (line[i].equals("-")) {
                                        result = Integer.parseInt(line[i-1]) - Integer.parseInt(line[i+1]);
                                    System.out.print(result);
                                }
                                else if (line[i].equals("*")) {
                                    result = Integer.parseInt(line[i+1]) * Integer.parseInt(line[i-1]);
                                    System.out.print(result);
                                }
                                else if (line[i].equals("/")) {
                                        try {
                                                result = Integer.parseInt(line[i-1]) / Integer.parseInt(line[i+1]);
                                                if (Integer.parseInt(line[i+1]) == 0) {
                                                        throw new ArithmeticException();
                                                }
                                                System.out.print(result);
                                        }
                                        catch (ArithmeticException ex) {
                                                System.err.print("Cannot divide by zero! Re-enter expression.");
                                                isValid = false;                               
                                                }
                                }
                                else if (line[i].equals("%")) {
                                        result = Integer.parseInt(line[i-1]) % Integer.parseInt(line[i+1]);
                                        System.out.print(result);
                                }
                               
                                isValid = true;
                                input.close();
                           }
                        }
                        catch (NumberFormatException ex) {
                                try {
                                        throw new NotANumberException(ex);
                                } catch (NotANumberException e) {
                                        System.err.println("Opperand is not a number. Re-enter expression.");
                                        isValid = false;                       
                                        }
                        }

                } while (isValid == false);
        }
       

        public static String[] getExpression (Scanner input) throws NotEnoughNumbersException {
                String exp = input.nextLine();
                if (exp.split(" ").length < 3) {
                        throw new NotEnoughNumbersException();
                }
                return exp.split(" ");
        }
       

        public static double getNextOperand (String operand) {
                return Double.parseDouble(operand);
        }
       

        public static String getNextOperator (String operator) throws IllegalOperationException {
                if (!((operator.equals("+") || operator.equals("-") || operator.equals("*") ||
                         operator.equals("/") || operator.equals("%")))) {
                        throw new IllegalOperationException();
                }
                return operator;
        }
       
        @SuppressWarnings("serial")
        public static class NotANumberException extends Exception {
                public NotANumberException() {
                        super();
                }
                       
                public NotANumberException(String message) {
                        super(message);
                }
               
                public NotANumberException(String message, Throwable cause) {
                        super(message, cause);
                }
               
                public NotANumberException(Throwable cause) {
                        super(cause);
                }
        }
       

        @SuppressWarnings("serial")
        public static class IllegalOperationException extends Exception {
                public IllegalOperationException() {
                        super();
                }
                       
                public IllegalOperationException(String message) {
                        super(message);
                }
               
                public IllegalOperationException(String message, Throwable cause) {
                        super(message, cause);
                }
               
                public IllegalOperationException(Throwable cause) {
                        super(cause);
                }
        }
       

        @SuppressWarnings("serial")
        public static class NotEnoughNumbersException extends Exception {
                public NotEnoughNumbersException() {
                        super();
                }
                       
                public NotEnoughNumbersException(String message) {
                        super(message);
                }
               
                public NotEnoughNumbersException(String message, Throwable cause) {
                        super(message, cause);
                }
               
                public NotEnoughNumbersException(Throwable cause) {
                        super(cause);
                }
        }
}