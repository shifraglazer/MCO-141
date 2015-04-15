import java.util.Scanner;
public class Chapter3Problem2{
  public static void main(String [] args){
    Scanner keyboard= new Scanner(System.in); 

    System.out.println("Enter a month in numeric form");
    int month= keyboard.nextInt();
    
    System.out.println("Enter day in numeric form");
     int day= keyboard.nextInt();
     
     System.out.println("Enter a two digit year");
    int year= keyboard.nextInt();
    
    if (month*day== year){
      System.out.println("The date is magic.");
    }
    else {
    System.out.println("The date is not magic");
    }
    
  }
}