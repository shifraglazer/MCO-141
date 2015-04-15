import java.util.Scanner;
public class Chapter2Problem8{
  
  public static void main (String [] args ){
    
    Scanner keyboard= new Scanner (System.in);
    System.out.println("What is the amount of purchase?");
    double purchase= keyboard.nextDouble();
    double stateTax= .04* purchase;
    double countyTax= .02*purchase;
    double salesTax= stateTax+ countyTax;
    double totalSale= purchase+ salesTax;
    System.out.println( "Total amount of purchase is $"+ purchase +".");
    System.out.println( "State sales Tax is $" +stateTax +"."); 
    System.out.println( "County sales Tax is $" +countyTax +"."); 
    System.out.println( "Total sales Tax is $" +salesTax +"."); 
    System.out.println( "Total of the sale is $"+ totalSale+ "."); 
                                                             
                                                             
                                                             
                                                             
                                                             }
  
  
  
  
}