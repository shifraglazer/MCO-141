import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter3Problem14{
  public static void main(String args []){
    
    Scanner keyboard= new Scanner(System.in);
    DecimalFormat formatter= new DecimalFormat("$#,##0.00");
    
    System.out.println("Choose package A, B, or C");
    String choice= keyboard.nextLine();
    
    System.out.println("How many hours was internet used?");
    double hours= keyboard.nextDouble();
    
    switch(choice.charAt(0)){
      case('A'):
      case('a'):
        double monthlyCharge=9.95;
        double additionalHours= hours - 10;
        double additionalCharge;
        
        if(additionalHours > 0){
          additionalCharge= additionalHours * 2;
        }
        else{
          additionalCharge= 0;
        }
        
        double packageCost= monthlyCharge + additionalCharge;
        System.out.println("Total charge for the month is " + formatter.format(packageCost));
        
        
        if(hours> 20){
        additionalCharge=(hours-20);
        }
        else{
        additionalCharge=0;
        }
        double optionB= additionalCharge+13.95;
        if(packageCost > optionB){
        System.out.println("Package B would save you " + formatter.format(packageCost- optionB));
        }
        if(packageCost > 19.95){
          System.out.println("Package C would save you " + formatter.format(packageCost- 19.95));
        }
        else{
        System.out.println("Package B and C would not give you any savings.");
        }
        break;
        
      case('B'):
      case('b'):
        double monthlyChargeB=13.95;
        double additionalHoursB= hours - 20;
        double additionalChargeB;
        
        if(additionalHoursB > 0){
          additionalChargeB= additionalHoursB * 1;
        }
        else{
          additionalChargeB= 0;
        }
        
        double packageCostB= monthlyChargeB + additionalChargeB;
        System.out.println("Total charge for the month is " + formatter.format(packageCostB));
        
        if(packageCostB> 19.95){
        System.out.println("Package C would save you " + formatter.format(packageCostB- 19.95));
        }
        else{
        System.out.println("Package C would not give you any savings.");
        }
        break;
        
      case('C'):
      case('c'):
        double monthlyChargeC=19.95;
        System.out.println("Total charge for the month is " + formatter.format(monthlyChargeC));
        break;
      default:
        System.out.println("Error: Please enter a valid package");
    }
    
    
    
    
    
    
  }




}