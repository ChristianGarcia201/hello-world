/*
Created by Christian Garcia, this program converts text to binary, and binary 
to text, and eventually (when I get around to it, that is) to/from hexadecimal, 
octal, etc. 
 */
package Converter;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.*;

public class TexttoBinary {

    public static String[] choices = {"Text to Binary Converter", 
        "Binary to Text Converter"}; 
// These are the dropdown menu choices.

    public static void main(String[] args) {

        String input;

        JOptionPane.showMessageDialog( null, "Welcome to my conversion "
                + "program!", "Converter", JOptionPane.PLAIN_MESSAGE );

        while( true ) {
        /* 
        The "while" loop starts here because this is the specific point
        we want it to loop back to in the later "if" statement, when 
        "No" is selected.
        */

            String dropdownMenu = ( String ) JOptionPane.showInputDialog( null,
                    "Please choose a converter", "Converter",
                    JOptionPane.QUESTION_MESSAGE, null, choices, choices[0] );

            if( dropdownMenu == choices[0] ) {
                /* 
                "If the selected choice = choice 0, run this choice's 
                process!"
                */
                JOptionPane.showMessageDialog( null, "In this program, it "
                        + "converts a text input and uses each character's "
                        + "decimal value to run it through the binary number "
                        + "system.", "Text to Binary Converter Walk-through", 
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "For example: \n\t"
                        + "The binary value of the letter 'A' (capitalized) is "
                        + "65.", "Text to Binary Converter Walk-through",
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "'A' would then be "
                        + "represented by: \n01000001.", " Text to Binary "
                        + "Converter Walk-through",
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "Note: If you type in an "
                        + "integer, the system will understand it as a "
                        + "character's decimal value.", "Warning!", 
                        JOptionPane.WARNING_MESSAGE );

                input = JOptionPane.showInputDialog( null, "Please type a word,"
                        + " phrase, or sentence below." );

                String output = input;
        // String output is the user's text input.
                byte[] bytes = output.getBytes();
        /*
        [] is used for arrays. byte[] is the array and .getBytes() encodes the 
        String output into a sequence of bytes using the platorm's default 
        charset (character set), and storing the result into a new byte ARRAY, 
        so it used it in the byte[].
        */
                StringBuilder binary = new StringBuilder();
                int byteCount = 0;

                for( byte b : bytes ) {
        /*
        It means one thing, it is an enhanced "for(-each)" loop.
        "for(String i: words)" 
        means the same things as 
        "for(int i = 0; i < words.length; i++){}"
        */
                    int val = b;
                    for ( int i = 0; i < 8; i++ ) {
        //Below translation = value is below
                        binary.append( ( val & 128 ) == 0 ? 0 : 1 );
        /*
        append <-- add something at the end. For example, you can append 
        one file to another or you can append a field to a record.
            
        &  <-- verifies both operands
        && <-- stops evaluating if the first operand evaluates to false 
        since the result will be false.
        */
                        val <<= 1;
        //Shifts bit pattern of "val" left 1.
                        binary.append( ' ' );
        // ' ' <-- means a [space], which is a character.
        // '' <-- means no characer, hence, ' ' is correct.
        // "" <-- a String,
        // '' <-- a character
                        byteCount++;
                    }
                    if ( byteCount >= 4 ) {
                        binary.append( "\n" );
                        byteCount = 0;
                    }
                    /*
                    if ( byteCount >= 4 ) {
                    binary.append( "\n" );
                    byteCount = 0;
                    }
                    */
                }

                JOptionPane.showMessageDialog( null, "'" + output + "' "
                        + "converted into binary is \n" + binary, "Converter",
                        JOptionPane.PLAIN_MESSAGE );

            } else if ( dropdownMenu == choices[1] ) {
                JOptionPane.showMessageDialog( null, "In this program, it "
                        + "converts a binary input and uses each set of 8 "
                        + "values to convert into the characters they "
                        + "respresent.", "Binary to Text Converter "
                                + "Walk-through",
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "For example: \n\tThe "
                        + "binary value of 01000001 equals 65.", "Binary to "
                                + "Text Converter Walk-through",
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "The binary value of 65 "
                        + "represents of the letter 'A' (capitalized).", 
                        "Binary to Text Converter Walk-through",
                        JOptionPane.PLAIN_MESSAGE );

                JOptionPane.showMessageDialog( null, "Note: If you type in any "
                        + "other digits than 0s and 1s, the system will "
                        + "understand it as a character's decimal value.", 
                        "Warning!",
                        JOptionPane.WARNING_MESSAGE );
                
                int charCode; 
                String output = ""; 
                
                input = JOptionPane.showInputDialog( null, "Please type a " 
                        + "binary representation, with NO spaces." );

                
                for(int i = 0; i <= input.length() - 8; i+=8) { 
                    charCode = Integer.parseInt( input.substring( i, 
                            i + 8 ), 2 ); 
                    output += ( char ) charCode;
                    
                JOptionPane.showMessageDialog( null, "'" + input + "' "
                            + "converted into a string is \n" + output, 
                            "Converter", 
                            JOptionPane.PLAIN_MESSAGE ); 
                }
                
                int n = JOptionPane.showConfirmDialog( null, "Would you like "
                        + "to exit?", "Converter", 
                        JOptionPane.YES_NO_OPTION );

                if (n == JOptionPane.NO_OPTION) {
                    continue;
        // The above line is not necessary, but it's good practice typing it.
                } else {
                    JOptionPane.showMessageDialog( null, "No way... "
                            + "\nε(´סּ︵סּ`)з \nLenny is sad...don't make Lenny "
                            + "sad." );
                    JOptionPane.showMessageDialog( null, "¯\\_(ツ)_/¯ \nThank "
                            + "you for using my program!" );
                    break;
                }
            }
        System.exit(0);
        }
    }
}
