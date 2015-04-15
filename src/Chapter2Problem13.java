import java.util.Scanner;
public class Chapter2Problem13{
  public static void main (String [] args){
    
   Scanner keyboard= new Scanner(System.in);
  System.out.println("How much is the restaurant bill?");
  double restaurantBill= keyboard.nextDouble();
  
  double tax= restaurantBill*.0675;
  double tip= (tax+ restaurantBill)*.15;
  
  System.out.println("Meal charge is $"+ restaurantBill+ ".");
  System.out.println("Tax charge for the meal is $"+ tax+ ".");
  System.out.println("Total tip charge is $"+tip+".");
  System.out.println("Total charge for the meal is$"+ (tax+tip+restaurantBill)+".");
  
  
  
  
  
  }





}