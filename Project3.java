/*This program computes electrical resistance (R) and potential difference (U).
Produced by Christian Garcia for CSC 200; this is my third programming
assignment.
*/
package ElectricalResistance;

public class Project3 {


    public static void main(String[] args) {
        
        int lengthL;
        double diameterD;
        double areaA;
        int ampereCurrentI;
        double copperResistivityP;
        int siliconResistivityP;
        double electricalResistanceR1;
        double electricalResistanceR2;
        double potentialDifferenceUR1;
        double potentialDifferenceUR2;
        
        lengthL = 1;
        diameterD = 0.001;
        areaA = Math.pow( diameterD, 2 );
        ampereCurrentI = 25;
        copperResistivityP = 1.78e-8;
        siliconResistivityP = 2300;
        
        electricalResistanceR1 = copperResistivityP * ( lengthL / areaA );
        potentialDifferenceUR1 = electricalResistanceR1 * ampereCurrentI;
        System.out.println ( "The electrical resistance (R) of Copper is " + 
                electricalResistanceR1 + " ohm and its potential difference "
                + "(U) is " + potentialDifferenceUR1 + " joules. ");
        
        electricalResistanceR2 = siliconResistivityP * ( lengthL / areaA );
        potentialDifferenceUR2 = electricalResistanceR2 * ampereCurrentI;
        System.out.println ( "The electrical resistance (R) of Silicon is " + 
                electricalResistanceR2 + " ohm and its potential difference "
                + "(U) is " + potentialDifferenceUR2 + " joules. ");
    }
}