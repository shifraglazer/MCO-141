import java.util.Scanner;

public class Chapter4Problem8{
  public static void main(String args[]){
  
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Number of years?");
    int years=keyboard.nextInt();
    
    int inches=0;
    
    //will run the amount of years
    for(int i=1; i<=years;i++){
      
      //will run 12 months for each year
      for(int j=1; j<=12;j++){
        System.out.println("Enter inches of rain in year " + i + " month "+ j);
        
        //add amount of inches from this month to total
        inches += keyboard.nextInt();
      }
    }
    
    int months= years*12;
    System.out.println("Number of months is " + months);
    System.out.println("Inches of rain is " + inches);
    double averageRainfall= (double)(inches)/months;
    System.out.println("Average rainfall is " + averageRainfall);
    
    
  }



}