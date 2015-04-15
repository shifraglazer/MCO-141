import java.util.Scanner;
import java.text.DecimalFormat;

public class BillCalculator{
  public static void main (String [] args){
    
   Scanner keyboard= new Scanner(System.in);
  System.out.println("How much is the restaurant bill?");
  double restaurantBill= keyboard.nextDouble();
  
  double tax= restaurantBill*.0675;
  double tip= (tax+ restaurantBill)*.15;
  
  DecimalFormat formatter= new DecimalFormat("$#,##0.00");
  
  System.out.println("Meal charge is "+ formatter.format(restaurantBill)+ ".");
  System.out.println("Tax charge for the meal is "+ formatter.format(tax)+ ".");
  System.out.println("Total tip charge is "+ formatter.format(tip)+".");
  System.out.println("Total charge for the meal is "+ formatter.format((tax+tip+restaurantBill))+".");
  
  
  
  
  
  }





}