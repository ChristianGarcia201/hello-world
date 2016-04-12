/*This program computes the rate of return.
Produced by Christian Garcia for CSC 200; this is my first programming
assignment.
*/
package StockMarketValue;

import java.util.*;


public class Project1 {

    
    public static void main(String[] args)
    {
    
    Scanner myScanner = new Scanner(System.in);
    /*
    Scanner can be named anything and, whenever the Scanner name is used,
    asks for an input from the keyboard (or user) in order to correctly work.
    */
    
    System.out.println( "Hello, welcome to my program! What is your name?" );
    String name = myScanner.nextLine();   
    /*
    The user enters their name, saved as a String called "name", input from the
    scanner called "myScanner".    
    */
    
    System.out.println( "Hi, " +name+ ". Please enter an annual return value." );        
    String annualReturnValue = myScanner.nextLine();
    /*
    The user enters an annual return value. Since this is logged into the
    program as a String or a phrase or sentence of sorts, it needs to be 
    converted into a number so the system reads it as such. (Thus, it can be 
    properly put into the program's code since the code ITSELF requires a number
    (or "int") in order to properly work.
    */
    
    int num1 = Integer.parseInt( annualReturnValue );
    /*
    This code converts the String annualReturnValue into an interger (AKA a 
    VALID number) so the program's code reads it properly and is a valid input.
    */
    
    if ( num1 <-10)
    {
        System.out.println( "The rate of return is indicative of a bear market"
                + "(which occurs 10% of the time)." );
    }
    else if ( num1 >=-10 && num1 <10)
        {
            System.out.println( "The rate of return is indicative of a stagnant market"
                    + "(which occurs 30% of the time)." );
        }
    else if ( num1 >=10 && num1 <30 )
        {
            System.out.println( "The rate of return is indicative of a bull market"
                    + "(which occurs 43% of the time)." );
        }
    else
    {
        System.out.println( "The rate of return is indicative of a boom "
                + "market (which occurs 17% of the time)." );
    }
    
    myScanner.next();
    /*
    This line of code tells the program to stop working so the program doesn't
    crash or continue to loop.
    */
    
    }
    
}
