//This program is written by Christian Garcia
//The input is the cost of the item
//The output is the change in minu...
package changemachine;

import java.text.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Change {
    
    public static void MinimumDenom( double change , double cost ) {
        String output = "";
        int newChange = ( int ) ( change * 100 );
        DecimalFormat df = new DecimalFormat( "##.###" );
        
        int qtrs = newChange / 25;       newChange = newChange % 25;
        //"newChange divided by cost is newChange, now keep the remainder"
        int dimes = newChange / 10;      newChange = newChange % 10;
        /*The remainder of above (AKA the NEW newChange) is divided by 10,
        then mod 10 and keep the remainder.
        */
        //And so on and so forth...
        int nickels = newChange / 5;     newChange = newChange % 5;
        
        int pennies = newChange;
        /*
        IMPORTANT: THE MOD FUNCTION ONLY WORKS ON INTEGER, NOT DOUBLE OR
        ANY OTHER DATA TYPE.
        */
        output += "\nThe cost of the items: $" + df.format( cost )
                + "\nThe minimum change from $" + df.format( change ) + " is "
                + "\n Quarters = " + qtrs
                + "\n Dimes    = " + dimes
                + "\n Nickels  = " + nickels
                + "\n Pennies  = " + pennies + "\n";
        
        JOptionPane.showMessageDialog(null, output );
        /*
        parentComponent - determines the Frame in which the dialog is displayed;
        if null, or if the parentComponent has no Frame, a default Frame is used 
        message - the Object to display
        */
    }

    public static void main(String[] args) {

        final double dollar = 1.00;
        
        while( true ) {
            String input = JOptionPane.showInputDialog( "\nEnter cost "
                    + "of item" );
            /*For scanner, type Scanner kybd = new Scanner( System.in ); above
            System.out.println( "\nEnter cost of item" );
            */
            /*
            String input = JOptionPane.showInputDialong("\nEnter cost of 
            item. Then type system.out.println( "eg 0.35" )
            */
            double cost = Double.parseDouble( input );
            double change = dollar - cost;
            MinimumDenom( change, cost );
            //MinimumDenom is the name of the method (described in lines 12-44)
            //Here, we pass the change and the cost into MinimumDenom
        }
    }
}
//This is an entire program composed of many "mini" programs.