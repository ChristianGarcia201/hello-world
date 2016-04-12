/*This program simulates a vending machine.
Produced by Christian Garcia for CSC 200; this is my second programming
assignment.
 */
package vendingmachine;

import java.util.*;

public class VendingMachineDriver {

    public static double paymentSum;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        {
            char choice;
            // userrin's choice of action
            boolean done = false;
            // flag that says user wants to quit

            VendingMachine vm = new VendingMachine();

            System.out.println("Welcome to Christian's vending machine!\n");

            do {
                System.out.println(
                        "Options: (i)nsert money, (s)elect an item," + " (q)uit");
                System.out.print("Enter i, s, or q ==> ");
                choice = scanner.nextLine().charAt(0);

                switch (choice) {
                    case 'i':
                    case 'I':
                        vm.insertMoney();
                        break;
                    case 's':
                    case 'S':
                        vm.selectItem();
                        break;
                    case 'q':
                    case 'Q':
                        done = true;
                        System.out.println( "Thank you, please come again." );
                        /* I put this in main (AKA Driver) simply because it
                        is only one System.out.println statement.
                        */
                        break;
                    default:
                        System.out.println("Invalid selection.");
                } // end switch
            } while (!done);
        } // end main
    }
}

