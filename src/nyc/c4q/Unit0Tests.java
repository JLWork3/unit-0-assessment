package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests
{

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main(String args[])
    {
        // Use main to test your methods
        printHelloWorld();
        returnPrimitiveBooleanTrue();
        printSumOf1Upto10UsingForLoop();


    }

    public static void printHelloWorld()
    {
        System.out.println(" Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue()
    {
        if(1 == 1)
        {
            System.out.print("true");
        }
        else System.out.print("false");

        return returnPrimitiveBooleanTrue();

    }


    public static Integer returnPrimitiveInt1729(int num)
    {

        num = 1729;

        return returnPrimitiveInt1729(num);
    }

    public static Object returnPrimitiveDoubleThreePointOneFour()
    {
        return null;
    }

    public static Object returnPrimitiveCharZ()
    {
        return false;
    }

    public static void printSumOf1Upto10UsingForLoop()
    {
        int i = 1;
        for(i = 1; i < 11; i++)
        {
            System.out.print(i + 1);
            i++;
        }
    }

    public static void printSumOf1Upto10000UsingForLoop()
    {
        for(int i =1; 0 <10001; i++){
            System.out.print(i +1);
            i++;
        }
    }

    public static boolean isOdd(int n)

    { n = 1;
        if (n==2){
            return true;
        }
        else

        return false;
    }

    public static boolean isMultipleOfThree(int n)
    {
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n)
    {
        return false;
    }

    public static String repeatStringXTimes(String input, int times)
    {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return "";
    }

    public static String returnStringUntilQ(String input)
    {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        return "";
    }

    public static Person declareAndReturnPersonNamedAda()
    {
        return null;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon()
    {
        return null;
    }

    public static boolean isFromLondon(Person person)
    {
        return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces()
    {


        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper()
    {
        // The HashMap should have key-value pairs of:
        // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
        // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people)
    {


    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers()
    {
        int n = 0;

        if(n == 0)
        {
            System.out.println("0");
        }
        else if(n == 1)
        {
            System.out.println("0 1");
        }
        else
        {
            System.out.print("0 1 ");
            int a = 0;
            int b = 1;
            for(int i = 1; i < n; i++)
            {
                int nextNumber = a + b;
                System.out.print(nextNumber + " ");
                a = b;
                b = nextNumber;
            }
        }

    }
    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers()
    {
        int n = 0;

        if(n == 0)
        {
            System.out.println("0");
        }
        else if(n == 1)
        {
            System.out.println("0 1");
        }
        else
        {
            System.out.print("0 1 ");
            int a = 0;
            int b = 1;
            for(int i = 1; i < 41; i++)
            {
                int nextNumber = a + b;
                System.out.print(nextNumber + " ");
                a = b;
                b = nextNumber;
            }
        }
    }

}
