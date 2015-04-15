import java.util.Scanner;
public class Thermometer{
  public static void main(String args []){
    
    
    Scanner keyboard= new Scanner(System.in);
    
    System.out.println("Enter temperture");
    double temperature= keyboard.nextDouble();
    
    if(temperature < 95 || temperature > 100){
      System.out.println("Outside normal range");
    }
    
    
  }
}