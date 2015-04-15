import java.util.Scanner;
import java.text.DecimalFormat;
class Chapter5Problem4 {
  
  public static double getGallonsRequired(double totalSqFeet) {
    double gallonsRequired = totalSqFeet / 115.0;
    return gallonsRequired;
  }
  
  public static double getHoursRequired(double gallons) {
    return gallons*8.0;
  }
  
  public static double getPaintCost(double gallons, double priceOfPaint){
    return gallons*priceOfPaint;
  }
  
  public static double getLaborCharges(double hours){
    return hours*18.0;
  }
  
  public static double getTotalCost(double paintCost, double laborCost){
    return paintCost+ laborCost;
  }
  
  public static double getTotalSqFeet(int numberOfRooms, Scanner keyboard){
    double totalSqFeet = 0;
    
    for ( int i =0; i < numberOfRooms; i++ ) {
      System.out.println("Square Feet?");
      double sqFt = keyboard.nextDouble();
      totalSqFeet += sqFt;
    }
    return totalSqFeet;
  }
  public static void main( String args[] ) {
    
    // 115 sq ft
    // 1 gallon
    // 8 hours
    // 1 hour = $18
    
    DecimalFormat formatter= new DecimalFormat("#,###.00");
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Number of rooms?");
    int numberOfRooms = keyboard.nextInt();
    
    System.out.println("Price of paint per gallon?");
    double priceOfPaint = keyboard.nextDouble();
    
    double totalSqFeet=getTotalSqFeet(numberOfRooms, keyboard);
    
    double gallons=getGallonsRequired(totalSqFeet);
    double hours=getHoursRequired(gallons);
    double paintCost=getPaintCost(gallons, priceOfPaint);
    double laborCost=getLaborCharges(hours);
    double totalCost=getTotalCost(paintCost,laborCost);
    
    System.out.println(formatter.format(totalCost));
  }
  
}