import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter3Problem10{
  public static void main(String args []){
  
  Scanner keyboard= new Scanner(System.in);
  DecimalFormat formatter= new DecimalFormat("#0%");
  
  System.out.println("Enter the amount of calories");
  int calories= keyboard.nextInt();
  
  System.out.println("Enter the amount of fat grams");
  int fatGrams= keyboard.nextInt();
  
  int caloriesFromFat= fatGrams * 9;
  double totalCalories= calories + caloriesFromFat;
  double percentageCaloriesFromFat= caloriesFromFat / totalCalories;
  
  System.out.println("Percentage of calories from fat is " + formatter.format(percentageCaloriesFromFat));
  
  if(caloriesFromFat < (.3 * totalCalories )){
    System.out.println("Food is low fat");
  }
     
     if (caloriesFromFat > totalCalories){
       System.out.println("Error: input is invalid");
     }
     
  
  }



}