import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter3Problem12{
  public static void main(String args []){
  
  Scanner keyboard= new Scanner(System.in);
  DecimalFormat formatter= new DecimalFormat("#0.00");
  
  System.out.println("Enter air, water, or steel");
  String medium= keyboard.nextLine();
  
  System.out.println("What is distance the sound wave will travel?");
  double distance= keyboard.nextDouble();
  
//  switch (medium){
//    case("air"):
//      double time= distance/1100;
//      System.out.println("It will take " + formatter.format(time) + " seconds");
//      break;
//    case("water"):
//      double time= distance/4900;
//      System.out.println("It will take " + formatter.format(time) + " seconds");
//      break;
//    case("steel"):
//      double time= distance/16400;
//      System.out.println("It will take " + formatter.format(time) + " seconds");
//      break;
//    default:
//      System.out.println("Invalid medium entered");
//  }
  
  if(medium.equalsIgnoreCase("air")){
  double time= distance/1100;
      System.out.println("It will take " + formatter.format(time) + " seconds"); 
  }
  else if(medium.equalsIgnoreCase("water")){
   double time= distance/4900;
      System.out.println("It will take " + formatter.format(time) + " seconds");
  }
  else if(medium.equalsIgnoreCase("steel")){
  double time= distance/16400;
      System.out.println("It will take " + formatter.format(time) + " seconds");
  }
  else{
  System.out.println("Invalid medium entered");
  }
  
  }



}