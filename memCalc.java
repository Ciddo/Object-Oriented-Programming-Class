import java.util.*;

public class memCalc
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        String op;
        int numberOne, numberTwo, result = 0;
        numberOne = input.nextInt();
        op = input.next();
        numberTwo = input.nextInt();
        if (op.equals("+"))
        {
            result = numberOne + numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        }
        else if (op.equals("-"))
        {
            result = numberOne - numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        }
        else if (op.equals("*")) 
        {
            result = numberOne * numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        }
        else if (op.equals("/"))
        {
            result = numberOne / numberTwo;
            System.out.print("The answer is: " + result + " .\n");
        }
    }
}