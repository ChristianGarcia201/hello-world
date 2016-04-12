package StockMarketValue;

import java.util.*;

public class NewClass {

  public static void main(String[] args)
    {
          // Program to display rate of return
    double annualReturn, range;
    while ( true )
    {
    String market = "";
    Scanner kybd = new Scanner(System.in);
    System.out.println("\n\rEnter Annual Rate of Return");
    annualReturn = kybd.nextDouble();

    if ( annualReturn < -0.10 )
    {
        range = .10;
        market = "bear";
    }
    else if ( annualReturn < .10 )
    {
        range = .30;
        market = "stagnant";
    }
    else if ( annualReturn < .30 )
    {
        range = .43;
        market = "bull";
    }
    else
    {
        range = .17;
        market = "boom";        
    }
    System.out.println( "\n\rThe rate of return is indicative of a " 
            + market + " market (which occurs " + (int) ( range * 100) + "% of the " +
            "time).");
    }
}
}
