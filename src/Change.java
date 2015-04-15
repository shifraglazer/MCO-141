import java.util.Scanner;
  public class Change{
  public static void main (String args []){
  
    Scanner keyboard= new Scanner (System.in);
    
    System.out.println("What is the cost of the product?");
    double cost= keyboard.nextDouble();
     
    System.out.println("How much did you pay?");
    double paid= keyboard.nextDouble();
    
    
    double change= paid-cost;
    int dollars= (int)(change/1);
    change=change-dollars;
    
    int quarters=(int)(change/.25);
    System.out.println(dollars + " dollars");
  
    change=change- quarters*.25; 
    System.out.println(quarters + " quarters");
   
    
    int dimes= (int)(change/.1);
    System.out.println(dimes+ " dimes");
    change=change- (dimes*.1);
    
    int nickles= (int)(change/.05);
    System.out.println( nickles +" nickles");
    change= change- (nickles*.05);
    
    int penny= (int)(change/.01);
    System.out.println(penny+ " pennies");
    
    
    
    
  }
  }