import java.util.Scanner;

 public class AllStar
 
 {

   public static void main( String args[])

 {

   Scanner input = new Scanner( System.in );

   

      double hits;
      double atbat;
      double battingAverage;
             

        System.out.print("Please input the player's at-bats: ");
        atbat = input.nextDouble;
        System.out.println( " ");  
        
        System.out.print("Please input the player's hits: ");
        hits = input.nextDouble;
        System.out.println( " ");   

        double battingAverage = atbat / hits;   
        
        if battingAverage > 0.300;      

        System.out.println("Since it is above 0.300 they are eligible for the All Star Game";
        System.out.println( " "); }
        
        else if 
        
        System.out.println("Since it is below 0.300 they are ineligible for the All Star Game";
        System.out.println( " "); }


     }
}