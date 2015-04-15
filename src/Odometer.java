import java.util.Scanner;
import java.text.DecimalFormat;
public class Odometer{
  public static void main(String args []){
    
    DecimalFormat formatter=new DecimalFormat("#.00");
    Scanner keyboard=new Scanner(System.in);
    int revolutions=0;
    int i=1;
    
//  System.out.println("Enter diameter");
    double diameter=keyboard.nextDouble();
    
//  System.out.println("Enter revolutions");
    revolutions=keyboard.nextInt();
    
//  System.out.println("Enter time");
    double time=keyboard.nextDouble();
    
    while(revolutions!=0){
      
      double p=3.1415927;
      int mile=5280;
      int feet=12;
      
      System.out.print("Trip #" + i +": ");
      
      double distance=(p*diameter* revolutions)/(mile*feet);
      System.out.print(formatter.format(distance) +" ");
      
      
      double mph= distance/time;
      System.out.println(formatter.format(mph*3600));
      
      
//      System.out.println("Enter diameter");
      diameter=keyboard.nextDouble();
      
//      System.out.println("Enter revolutions");
      revolutions=keyboard.nextInt();
      
//      System.out.println("Enter time");
      time=keyboard.nextDouble();
      i++;
    }
    
    
  }
  
}