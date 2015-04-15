import java.util.Scanner;

public class Chapter2Problem9{
  public static void main (String [] args){
    Scanner keyboard= new Scanner (System.in);
    
    
    System.out.println("How many miles were driven?");
    double miles= keyboard.nextDouble();
    
    System.out.println("How many gallons of gas were used?");
    double gallons=keyboard.nextDouble();
    
    double mPG= miles/gallons;
    System.out.println("The car's mile-per-gallon usage is " +mPG+ ".");
    
    
  
  
  
  }



}