package javaapplication18;

import java.util.Scanner;
import javax.swing.*;

public class power2 {
    
    public static long Compute_power( int b, int e ) {
        /*
        Or you can do "return ( ( e == 0 ) ? 1 : b * Compute_power( b, --e ) );"
        This is known as the recursive method, shortening, simpifying, etc.
        */
        long result = 1; if ( e < 0 ) e = -e;
        /* 
        long result ALWAYS EQUALS 1, UNLESS (follow "if" statement, continued
        at "if( exponent < 0 ) {...} else {...}"
        */
        while( e > 0 ) {
            result = result * b;
            e = e - 1;
        }
        return result;
        /*
        If this line wasn't here, it would do the method but not returning 
        anything, in this case, the result.
        
        "Give me the result of this and use it down in Compute_power below"
        "return the result back into a long named Compute_power."
        */
        
        /*
        Or you can do "public static void outputResult( String out ) {
        JOptionPane.showMessageDialog( null, out );
        [return] and it'd return the *control*.
        }
        */
    }
    
    public static void main(String[] args) {
        String output = "";
        while( true ) {
            /*
            Or you can do "for ( ; ; ){
            } for an infinite loop."
            */
            String input1 = JOptionPane.showInputDialog("\nEnter a positive number"
                + " e.g. 3 for the base");
            String input2 = JOptionPane.showInputDialog("\nEnter any number"
                + " e.g. 5 for the exponent");
        
            int base = Integer.parseInt( input1 );
            /* 
            Converts input1 into an integer AKA "3" is now the number/value 3.
            */
            int exponent = Integer.parseInt( input2 );
            /*
            For Scanner, do "
            Scanner kybd = new Scanner( System.in );
            
            for ( ; ; ){
                System.out.println("\nEnter any number for the base e.g. 2");
                int base = kybd.nextInt;
            
                System.out.println("\nEnter any number for the exponent e.g. 3");
                int exponent = kybd.nextInt;
                
                long power = Compute_power( base, exponent );
            
                Sysyem.out.println( "The base " + base + " raised to the power "
                + "of " + exponent + " = " + power );
            }
            "
            */
            long power = Compute_power( base, exponent );
            /*
            long power expects a value from Compute_power, passing base into b
            and exponent into e. We're calling to our new method called 
            "Compute_power" to return/DISPLAY the value.
            */
            if( exponent < 0 ) {
                output += "The base " + base + " rasied to the power of " 
                        + exponent + " = " + 1.0/power + '\n';
            // Doing "1.0/power" makes it into a floating point.
            } else {
                output += "The base " + base + " rasied to the power of " 
                        + exponent + " = " + power + '\n';
            }
        
        output += "The base " + base + " rasied to the power of " + exponent +
                " = " + power + '\n';
        
        JOptionPane.showMessageDialog( null, output );
        /*
        Or you can do "outputResult( output );"
        */
        }
    }
}