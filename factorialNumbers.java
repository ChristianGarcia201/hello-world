import java.util.Scanner;

import javax.swing.*;

public class factorialNumbers {
    
    public static long compute_Factorial ( int n ) {
        long fact = 1;
        
        while ( n > 0 ) {
            fact = ( fact * n );
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        String output = "";
        while( true ) {
        String input = JOptionPane.showInputDialog("\nEnter any positive"
                + " number");
        
        int num = Integer.parseInt( input );
        
        long result = compute_Factorial( num );
        
        output += "\nThe factorial of " + num + " is " + result + '\n';
        
        JOptionPane.showMessageDialog( null , output );
        }
    }
}
