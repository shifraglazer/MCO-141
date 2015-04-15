import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter5Problem2{

  
  public static double calculateRetail(double cost,double markup){
  
 double retail= cost* (1+ markup/100);
  return retail;  
  }
  
  
  public static void main(String args []){
  
    Scanner keyboard= new Scanner(System.in);
    DecimalFormat f= new DecimalFormat("#,###.00");
    
  System.out.println("Enter item's wholesale cost");
  double cost=keyboard.nextDouble();
  
  System.out.println("Enter markup percentage");
  double markup=keyboard.nextDouble();
  
 
  double retail= calculateRetail(cost,markup);
  System.out.println(f.format(retail));
  
  }


}