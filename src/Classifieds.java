import java.util.Scanner;

public class Classifieds{
  public static void main( String args []){
   String text;
   Scanner keyboard= new Scanner(System.in);
   
   System.out.println("What is the text for the ad?");
   text= keyboard.nextLine();
   
   
  double costPerLetter= .10;
  double totalCost= text.length() * costPerLetter;
  System.out.println(totalCost);
  
  
  
  
  
  
  
}
}