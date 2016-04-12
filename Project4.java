/*This program solves quadratic equations.
Produced by Christian Garcia for CSC 200; this is my fourth programming
assignment.
*/
package QuadraticEquation;

public class Project4 {
    
    public static void main(String[] args) {
        
      float a = 1.0f;
      float b = 2.0f;
      float c = -3.0f;
        float x_0 = ( float ) ( -b + Math.sqrt(b*b - 4*a*c ))/( 2*a );
        float x_1 = ( float ) ( -b - Math.sqrt(b*b - 4*a*c ))/( 2*a );
      System.out.println( "The first set of values is:" );
        System.out.println( x_0 );
        System.out.println( x_1 );
        //test. This should return 0
        System.out.println( a*x_0*x_0 + b*x_0+c );
        System.out.println( a*x_1*x_1 + b*x_1+c );
    
    System.out.println();  
        
      float a2 = 1.0f;
      float b2 = 2.0f;
      float c2 = 1.0f;
        float x_2 = ( float ) ( -b2 + Math.sqrt(b2*b2 - 4*a2*c2 ))/( 2*a2 );
        float x_3 = ( float ) ( -b2 - Math.sqrt(b2*b2 - 4*a2*c2 ))/( 2*a2 );
      System.out.println( "The second set of values is:" );
        System.out.println( x_2 );
        System.out.println( x_3 );
        System.out.println( a2*x_2*x_2 + b2*x_2+c2 );
        System.out.println( a2*x_3*x_3 + b2*x_3+c2 );
        
    System.out.println();
        
      float a3 = 1.0f;
      float b3 = 1.0f;
      float c3 = 1.0f;
        float x_4 = ( float ) (-b3 + Math.sqrt(b3*b3 - 4*a3*c3))/(2*a3);
        float x_5 = ( float ) (-b3 - Math.sqrt(b3*b3 - 4*a3*c3))/(2*a3);        
      System.out.println( "The third set of values is:" );    
        System.out.println( x_4 );
        System.out.println( x_5 );
        System.out.println( a3*x_4*x_4 + b3*x_4+c3 );
        System.out.println( a3*x_5*x_5 + b3*x_5+c3 );
        
    System.out.println();
        
      float a4 = 1.0f;
      float b4 = -20000.0f;
      float c4 = 1.0f;
        float x_6 = ( float ) (-b4 + Math.sqrt(b4*b4 - 4*a4*c4))/(2*a4);
        float x_7 = ( float ) (-b4 - Math.sqrt(b4*b4 - 4*a4*c4))/(2*a4);        
      System.out.println( "The fourth set of values is:" );
        System.out.println( x_6 );
        System.out.println( x_7 );
        System.out.println( a4*x_4*x_4 + b4*x_6+c4 );
        System.out.println( a4*x_7*x_7 + b4*x_7+c4 );
        
    }
}
